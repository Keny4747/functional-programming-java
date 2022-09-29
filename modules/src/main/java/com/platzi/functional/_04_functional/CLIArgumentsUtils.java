package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    static void showHelp(CLIArguments cliArguments){

        Consumer<CLIArguments> consumerHelper = cliArgumentes->{
            if(cliArgumentes.isHelp()){
                System.out.println("Manual solicitado");
            }
        };

        consumerHelper.accept(cliArguments);
    }

    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator = ()-> new CLIArguments();

        return generator.get();
    }
}
