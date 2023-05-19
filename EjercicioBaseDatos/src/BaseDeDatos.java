import java.sql.*;
import java.util.Scanner;
public class BaseDeDatos {
	    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_ja";
	    private static final String USUARIO = "root";
	    private static final String CONTRASENA = "12345";
	    
	    private static Connection conexion;
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean conectado = false;
	        
	        while (true) {
	            System.out.print("> ");
	            String comando = scanner.nextLine();
	            
	            if (comando.startsWith("CONNECT")) {
	                if (conectado) {
	                    System.out.println("Ya estás conectado a la base de datos.");
	                } else {
	                    conectado = conectar();
	                }
	            } else if (comando.startsWith("DISCONNECT")) {
	                if (conectado) {
	                    desconectar();
	                    conectado = false;
	                } else {
	                    System.out.println("No estás conectado a la base de datos.");
	                }
	            } else if (comando.startsWith("EXIT")) {
	                if (conectado) {
	                    desconectar();
	                }
	                break;
	            } else if (comando.startsWith("SHOW")) {
	                if (conectado) {
	                    mostrarInformacion();
	                } else {
	                    System.out.println("No estás conectado a la base de datos.");
	                }
	            } else if (comando.startsWith("SEARCH")) {
	                if (conectado) {
	                    String nombre = comando.substring(7);
	                    buscarPorNombre(nombre);
	                } else {
	                    System.out.println("No estás conectado a la base de datos.");
	                }
	            } else if (comando.startsWith("INSERT")) {
	                if (conectado) {
	                    String[] parametros = comando.substring(7).split(":");
	                    if (parametros.length == 3) {
	                        String nombre = parametros[0];
	                        int cantidad = Integer.parseInt(parametros[1]);
	                        String comentario = parametros[2];
	                        insertarRegistro(nombre, cantidad, comentario);
	                    } else {
	                        System.out.println("Comando INSERT incorrecto. Debe tener el formato: INSERT:nombre:cantidad:comentario");
	                    }
	                } else {
	                    System.out.println("No estás conectado a la base de datos.");
	                }
	            } else if (comando.startsWith("UPDATE")) {
	            	if (conectado) {
	                    String[] parametros = comando.substring(7).split(":");
	                    if (parametros.length == 3) {
	                        int id = Integer.parseInt(parametros[0]);
	                        int nuevaCantidad = Integer.parseInt(parametros[1]);
	                        String nuevoComentario = parametros[2];
	                        actualizarRegistro(id, nuevaCantidad, nuevoComentario);
	                
	                    } else {
	                        System.out.println("Comando UPDATE incorrecto. Debe tener el formato: UPDATE:id:nuevaCantidad:nuevoComentario");
	                    }
	            	} else {
	                    System.out.println("No estás conectado a la base de datos.");
	                }
	            } else if (comando.startsWith("DELETE")) {
	            	if (conectado) {
	                    int id = Integer.parseInt(comando.substring(7));
	                    eliminarRegistro(id);
	                } else {
	                    System.out.println("No estás conectado a la base de datos.");
	                }
	            } else {
	                System.out.println("Comando no reconocido.");
	            }
	        }
	        
	        scanner.close();
	    }
	    
	    private static boolean conectar() {
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
	            System.out.println("Conexión exitosa.");
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }catch (ClassNotFoundException e) {
	        	e.printStackTrace();
	            return false;
	        }
	    }
	    
	    private static void desconectar() {
	        try {
	            conexion.close();
	            System.out.println("Desconexión exitosa.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void mostrarInformacion() {
	        try {
	            Statement statement = conexion.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM inventario");
	            
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String nombre = resultSet.getString("nombre");
	                int cantidad = resultSet.getInt("cantidad");
	                String comentario = resultSet.getString("comentario");
	                
	                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Comentario: " + comentario);
	            }
	            
	            resultSet.close();
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void buscarPorNombre(String nombre) {
	        try {
	            String query = "SELECT * FROM inventario WHERE nombre LIKE '%" + nombre + "%'";
	            Statement statement = conexion.createStatement();
	            ResultSet resultSet = statement.executeQuery(query);
	            
	            boolean encontrado = false;
	            
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String nombreResult = resultSet.getString("nombre");
	                int cantidad = resultSet.getInt("cantidad");
	                String comentario = resultSet.getString("comentario");
	                
	                System.out.println("ID: " + id + ", Nombre: " + nombreResult + ", Cantidad: " + cantidad + ", Comentario: " + comentario);
	                
	                encontrado = true;
	            }
	            
	            if (!encontrado) {
	                System.out.println("No existen referencias del objeto.");
	            }
	            
	            resultSet.close();
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void actualizarRegistro(int id, int nuevaCantidad, String nuevoComentario) {
	        try {
	            String query = "UPDATE inventario SET cantidad = ?, comentario = ? WHERE id = ?";
	            PreparedStatement statement = conexion.prepareStatement(query);
	            statement.setInt(1, nuevaCantidad);
	            statement.setString(2, nuevoComentario);
	            statement.setInt(3, id);
	            int filasActualizadas = statement.executeUpdate();

	            if (filasActualizadas > 0) {
	                System.out.println("Registro actualizado correctamente.");
	            } else {
	                System.out.println("No se encontró el registro con el ID especificado.");
	            }
	            
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void eliminarRegistro(int id) {
	        try {
	            String query = "DELETE FROM inventario WHERE id = ?";
	            PreparedStatement statement = conexion.prepareStatement(query);
	            statement.setInt(1, id);
	            int filasEliminadas = statement.executeUpdate();

	            if (filasEliminadas > 0) {
	                System.out.println("Registro eliminado correctamente.");
	            } else {
	                System.out.println("No se encontró el registro con el ID especificado.");
	            }
	            
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    

	    
	    
	    
	    private static void insertarRegistro(String nombre, int cantidad, String comentario) {
	        try {
	            String query = "INSERT INTO inventario (nombre, cantidad, comentario) VALUES (?, ?, ?)";
	            PreparedStatement statement = conexion.prepareStatement(query);
	            statement.setString(1, nombre);
	            statement.setInt(2, cantidad);
	            statement.setString(3, comentario);
	            statement.executeUpdate();
	            System.out.println("Registro insertado correctamente.");
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
