package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.development.GerenciaLugares;

/**
 * Unit test for simple App.
 */
public class TesteProcessamento 
{
    com.development.GerenciaLugares p = new GerenciaLugares();
    
    
    // teste tarefa numero 8


    //teste opção 0


    @Test
  public void opcao0(){
    assertEquals(0, p.verificaLugar(11, 49, 112));
  }


  //teste opção 1

  
  @Test
  public void addPessoaPrimeiros100(){
    p.addPessoa(10, 10, 5);
    assertEquals(1, p.verificaLugar(20, 10, 5));
  }

  
  @Test
  public void addPessoasEntre100E200(){
    p.addPessoa(118, 10, 45);
    assertEquals(1, p.verificaLugar(150, 10 , 45));
  }


  //teste opção 2


  @Test
  public void assentoBloqueadoPrimeiros100(){
    assertEquals(2, p.verificaLugar(8, 10, 30));
  }

  @Test
  public void assentoBloqueadoEntre100E200() {
    assertEquals(2, p.verificaLugar(150, 10, 10));
  }
    

  //teste opção 3


  @Test
  public void adicionandoPrimeiros100(){
    assertEquals(3, p.verificaLugar(10, 10, 8));
  }

  @Test
  public void adicionandoEntre100E200(){
    assertEquals(3, p.verificaLugar(102, 10, 41));
  }

  @Test
  public void adicionandoIdsMaiorQue200(){
    assertEquals(3, p.verificaLugar(210, 10, 12));
  }


}
