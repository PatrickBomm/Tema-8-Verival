package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;

import com.development.Processamento;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    com.development.Processamento p = new Processamento();
    
    
  @Test
  public void opcao2(){
    assertEquals(2, p.verificaLugar(8, 10, 30));
  }
    
  @Test
  public void opcao3(){
    assertEquals(3, p.verificaLugar(10, 10, 8));
  }

  @Test
  public void opcao1(){
    p.addPessoa(10, 10, 5);
    assertEquals(1, p.verificaLugar(20, 10, 5));
  }

  @Test
  public void opcao0(){
    assertEquals(0, p.verificaLugar(500, 50, 90));
  }
  
  @Test
  public void acessaAll(){
    Random r = new Random();
    for(int i = 0; i < 10; i++){
        int id = r.nextInt(800);
        int assento = r.nextInt(20);
        int fileira = r.nextInt(60);
        if(id > 200){
            assertEquals(3, p.verificaLugar(id, assento, fileira));
        }
    }
  }

}
