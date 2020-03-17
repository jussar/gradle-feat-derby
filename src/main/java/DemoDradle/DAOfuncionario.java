package DemoDradle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOfuncionario {

	private ConexaoDB con;
	
	public DAOfuncionario() {
		con = new ConexaoDB();
	}
	
	public void inserir(Funcionario f) {
		this.con.conectar();
		String sql = "INSERT INTO app.funcionario (nome,salario,entrada,cpf,idade) VALUES (?,?,?,?,?)";
		try (PreparedStatement statement = this.con.getConection().prepareStatement(sql);){
			statement.setString(1, f.getNome());
			statement.setFloat(2, f.getSalario());
			statement.setDate(3, f.getData());
			statement.setString(4, f.getCpf());
			statement.setInt(5, f.getIdade());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Funcionario buscar(String cpf) {
		this.con.conectar();
		String sql = "SELECT * FROM app.funcionario WHERE cpf = ?";
		Funcionario f = new Funcionario();
		try (PreparedStatement statement = this.con.getConection().prepareStatement(sql);){
			statement.setString(1, cpf);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				f.setCpf(result.getString("cpf"));
				f.setData(result.getDate("entrada"));
				f.setIdade(result.getInt("idade"));
				f.setNome(result.getString("nome"));
				f.setSalario(result.getFloat("salario"));
				return f;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}
		return null;
	}
	
	public void remover(String cpf) {
		this.con.conectar();
		String sql = "DELETE FROM app.funcionario WHERE cpf = ?";
		try (PreparedStatement statement = this.con.getConection().prepareStatement(sql);){
			statement.setString(1, cpf);
			statement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void editarDados(Funcionario f) {
		this.con.conectar();
		String sql =  "UPDATE app.funcionario SET nome = ?,salario = ?,entrada = ?,idade = ? where cpf = ?";
		try (PreparedStatement statement = this.con.getConection().prepareStatement(sql);){
			statement.setString(5, f.getCpf());
			statement.setString(1, f.getNome());
			statement.setFloat(2, f.getSalario());
			statement.setDate(3, f.getData());
			statement.setInt(4, f.getIdade());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
