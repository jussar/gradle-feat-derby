package DemoDradle;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Date;

public class AppTest{
    
	//testa o metodo de buscar funcionario da classe DAOfuncionario 
	//se buscar realmente retorna um funcionario
    @Test
    public void testbuscar() {
    	String cpf = "001";
    	DAOfuncionario classUnderTest = new DAOfuncionario();
    	assertEquals("001", classUnderTest.buscar(cpf).getCpf());
    }
    //testa se o funcionario foi inserido no banco
    @Test
    public void testinserir() {
    	DAOfuncionario classUnderTest = new DAOfuncionario();
    	Funcionario f = new Funcionario();
    	f.setCpf("111");
    	f.setNome("marcia nascimento");
    	f.setIdade(20);
    	f.setSalario(2000);
    	f.setData(new Date(12/12/2012));
    	classUnderTest.inserir(f);
    	assertEquals("111", classUnderTest.buscar("111").getCpf());
    }
    @Test
    public void testExcluir() {
    	DAOfuncionario classUnderTest = new DAOfuncionario();
    	Funcionario f = new Funcionario();
    	f.setCpf("111");
    	f.setNome("marcia nascimento");
    	f.setIdade(20);
    	f.setSalario(2000);
    	f.setData(new Date(12/12/2012));
    	classUnderTest.inserir(f);
    	classUnderTest.remover("111");
    	assertEquals(null, classUnderTest.buscar("111"));
    }
    @Test
    public void testEditarDados() {
    	DAOfuncionario classUnderTest = new DAOfuncionario();
    	Funcionario x = new Funcionario();
    	x.setSalario(1000);
    	x.setNome("kleyde granjero");
    	x.setIdade(66);
    	x.setData(new Date(06/06/2006));
    	x.setCpf("005");
    	classUnderTest.inserir(x);
    	
    	x.setSalario(3000);
    	x.setNome("marcia ghrangeiro");
    	x.setIdade(22);
    	x.setData(new Date(12/12/2012));
    	x.setCpf("005");
    	classUnderTest.editarDados(x);
    	assertEquals("marcia ghrangeiro", classUnderTest.buscar("005").getNome());
    }
   
}