        

        
        /*
        Integer nCadastro =(Integer.valueOf(JOptionPane.showInputDialog("Quantas pessoas serão cadastradas? (max. 4)")));
        
        Contador c1 = new Contador();
        Salario s1 = new Salario();        
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();


        switch(nCadastro){
            case 1:
                //Criando e cadastrando
                p1.setNome(JOptionPane.showInputDialog("Nome:"));
                p1.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p1.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p1.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p1.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p1.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p1.getSexo());
                s1.atualizaSalarioTotal(p1.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());
                //Resultados
                p1.mostraPessoa();
                p1.calculaIdade(p1.getAnoNascimento());
                p1.calculaImc(p1.getPeso(), p1.getAltua());
                c1.totalCastro();
                c1.totalSexo();
                s1.mostraSalarios();
            case 2:
                //Criando e cadastrando
                p1.setNome(JOptionPane.showInputDialog("Nome:"));
                p1.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p1.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p1.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p1.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p1.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p1.getSexo());
                s1.atualizaSalarioTotal(p1.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());                
                //Criando e cadastrando
                p2.setNome(JOptionPane.showInputDialog("Nome:"));
                p2.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p2.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p2.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p2.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p2.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));                
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p2.getSexo());
                s1.atualizaSalarioTotal(p2.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());       
                //Resultados
                p1.mostraPessoa();
                p2.mostraPessoa();
                p1.calculaIdade(p1.getAnoNascimento());
                p2.calculaIdade(p2.getAnoNascimento());
                p1.calculaImc(p1.getPeso(), p1.getAltua());
                p2.calculaImc(p1.getPeso(), p1.getAltua());
                c1.totalCastro();
                c1.totalSexo();
                s1.mostraSalarios();                
            case 3:
                //Criando e cadastrando 
                p1.setNome(JOptionPane.showInputDialog("Nome:"));
                p1.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p1.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p1.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p1.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p1.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p1.getSexo());
                s1.atualizaSalarioTotal(p1.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());                
                //Criando e cadastrando
                p2.setNome(JOptionPane.showInputDialog("Nome:"));
                p2.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p2.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p2.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p2.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p2.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));                
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p2.getSexo());
                s1.atualizaSalarioTotal(p2.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());    
                //Criando e cadastrando
                p3.setNome(JOptionPane.showInputDialog("Nome:"));
                p3.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p3.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p3.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p3.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p3.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));                
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p3.getSexo());
                s1.atualizaSalarioTotal(p3.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());                                               
                //Resultados
                p1.mostraPessoa();
                p2.mostraPessoa();
                p3.mostraPessoa();
                p1.calculaIdade(p1.getAnoNascimento());
                p2.calculaIdade(p2.getAnoNascimento());
                p3.calculaIdade(p3.getAnoNascimento());
                p1.calculaImc(p1.getPeso(), p1.getAltua());
                p2.calculaImc(p2.getPeso(), p2.getAltua());
                p3.calculaImc(p3.getPeso(), p3.getAltua());
                c1.totalCastro();
                c1.totalSexo();
                s1.mostraSalarios();
            case 4:
                //Criando e cadastrando 
                p1.setNome(JOptionPane.showInputDialog("Nome:"));
                p1.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p1.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p1.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p1.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p1.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p1.getSexo());
                s1.atualizaSalarioTotal(p1.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());                
                //Criando e cadastrando
                p2.setNome(JOptionPane.showInputDialog("Nome:"));
                p2.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p2.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p2.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p2.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p2.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));                
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p2.getSexo());
                s1.atualizaSalarioTotal(p2.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());    
                //Criando e cadastrando
                p3.setNome(JOptionPane.showInputDialog("Nome:"));
                p3.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p3.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p3.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p3.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p3.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));                
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p3.getSexo());
                s1.atualizaSalarioTotal(p3.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());    
                //Criando e cadastrando
                p4.setNome(JOptionPane.showInputDialog("Nome:"));
                p4.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
                p4.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
                p4.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
                p4.setAltua(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
                p4.setSalario(Float.valueOf(JOptionPane.showInputDialog("Salário:")));                
                //Atualizações pós cadastros
                c1.contaCadastro();
                c1.contaSexo(p4.getSexo());
                s1.atualizaSalarioTotal(p4.getSalario());
                s1.atualizaMediaSalario(c1.getCadastros());                               
                //Resultados
                p1.mostraPessoa();
                p2.mostraPessoa();
                p3.mostraPessoa();
                p4.mostraPessoa();
                p1.calculaIdade(p1.getAnoNascimento());
                p2.calculaIdade(p2.getAnoNascimento());
                p3.calculaIdade(p3.getAnoNascimento());
                p4.calculaIdade(p4.getAnoNascimento());
                p1.calculaImc(p1.getPeso(), p1.getAltua());
                p2.calculaImc(p2.getPeso(), p2.getAltua());
                p3.calculaImc(p3.getPeso(), p3.getAltua());
                p4.calculaImc(p4.getPeso(), p4.getAltua());
                c1.totalCastro();
                c1.totalSexo();
                s1.mostraSalarios();            
            
        }
        */