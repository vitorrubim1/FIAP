package javabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UsuarioDBOracle {


    public Connection ConexaoDB(){
        Connection conn = null;
       
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           
            conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm97092", "110602");


            if(conn!=null)
                System.out.println("Conexão estabelecida com sucesso!");
            else
                System.out.println("Falha na conexão com o Banco de Dados!");


        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return conn;
    }
   
    public void incluirAluno(Aluno aluno) {
        Connection conn = ConexaoDB();
        Statement statement;
        try {
            String query = String.format("insert into tb_aluno (id, nome, ra, curso) values (%s, '%s', '%s', '%s')", aluno.getId(), aluno.getNome(), aluno.getRa(), aluno.getCurso());
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Aluno incluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
   
    public void atualizarAluno(Aluno aluno) {
        Connection conn = ConexaoDB();
        Statement statement;
        try {
            String query = String.format("update tb_aluno set nome = '%s' where id = %s", aluno.getNome(), aluno.getId());
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Aluno atualizado com sucesso!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    public void excluirAluno(int id) {
        Connection conn = ConexaoDB();
        Statement statement;
        try {
            String query = String.format("delete from tb_aluno where id = %s", id);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Aluno excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void listarAlunos() {
        Connection conn = ConexaoDB();
        Statement statement;
        ResultSet rs = null;
        try {
            String query = "select * from tb_aluno";
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getString("id") + " ");
                System.out.println(rs.getString("nome"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void listarAluno(int id){
        Connection conn = ConexaoDB();
        Statement statement;
        ResultSet rs = null;
       
        try {
            String query = "select * from tb_aluno where id = " + id;
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
           
            if (rs.next()) {
                System.out.print(rs.getString("id")+" ");
                System.out.println(rs.getString("nome"));
            } else {
                System.out.println("Aluno não encontrado.");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
