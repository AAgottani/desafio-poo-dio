import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;

public class Main {

	public static void main(String[] args) {
	
	Curso curso1 = new Curso();
	Curso curso2 = new Curso();
	
	
	curso1.setTitulo("Curso Java");
	curso1.setDescricao("Descrição: Curso java ");
	curso1.setCargaHoraria(8);	
	
	curso2.setTitulo("Curso js");
	curso2.setDescricao("Descrição: Curso js ");
	curso2.setCargaHoraria(4);	
	

	
	Mentoria mentoria= new Mentoria();
	mentoria.setTitulo("Mentoria de java");
	mentoria.setDescricao("Descrição: Mentoria java");
	mentoria.setData(LocalDate.now());

	/*
	 * System.out.println(curso1);
	 *  System.out.println(curso2);
	 * System.out.println(mentoria);
	 */
	Bootcamp bootcamp= new Bootcamp();
	bootcamp.setNome("Bootcamp Java Developer");
	bootcamp.setDescrição("Bootcamp de desenvolvimento Java");
	bootcamp.getConteudos().add(curso1);
	bootcamp.getConteudos().add(curso2);
	bootcamp.getConteudos().add(mentoria);
	
	Dev devCamila= new Dev();
	devCamila.setNome("Camila");
	devCamila.inscreverBootcamp(bootcamp);
	System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
	
	Dev devJoao= new Dev();
	devJoao.setNome("João");
	devJoao.inscreverBootcamp(bootcamp);
	System.out.println("Ce oce tiver problema eu vou te ignorar");
	System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
			
	}

}
