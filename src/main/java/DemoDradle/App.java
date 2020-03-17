package DemoDradle;

import java.sql.Date;

public class App{
    
    public static void main(String[] args){

    	
    	
    	Funcionario s = new Funcionario();
    	s.setNome("keila");
    	s.setIdade(44);
    	s.setSalario(2004);
    	s.setData(new Date(04/04/2004));
    	s.setCpf("00199");
    	DAOfuncionario  dao = new DAOfuncionario();
    	dao.editarDados(s);
    	System.out.println(s.toString());
    }
}