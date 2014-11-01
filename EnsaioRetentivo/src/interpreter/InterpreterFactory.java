/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author Marcos
 */
public class InterpreterFactory {
    //Interpreters não serão diretamente instanciados pelo código. 
    /** @TODO Faz sentido o Factory ser estático?*/
    /** @TODO Exception joga string na exceção.*/
    Interpreter getInterpreter(String idioma) {
        if (idioma.toLowerCase().startsWith("pt") || idioma.toLowerCase().startsWith("br")) {
            return new InterpreterPT();
        }
        if (idioma.toLowerCase().startsWith("en")) {
            return new InterpreterEN();
        }
        throw new ExceptionInInitializerError("Problem with specified factory. Please check.");
    }
}
