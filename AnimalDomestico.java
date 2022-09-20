public class AnimalDomestico {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setRaca("labrador");
        cachorro.setCor("preto");
        cachorro.setSexo("macho");
        cachorro.setComportamento("Latir");
        cachorro.setPeso(5);

        System.out.println("As caracteristicas do cachorro são: Raça:"+ cachorro.getRaca());
        System.out.println("Cor:"+ cachorro.getCor());
        System.out.println("Sexo:"+ cachorro.getSexo());
        System.out.println("Peso:"+ cachorro.getRaca()+ "kg");
        System.out.println("Seu comportamento é:"+ cachorro.getComportamento());


        Gato gato = new Gato();
        gato.setRaca("Sianes");
        gato.setCor("cinza");
        gato.setSexo("femea");
        gato.setComportamento("Miar");
        gato.setPeso(4.5);

        System.out.println("As caracteristicas do gato são: Raça:"+ gato.getRaca());
        System.out.println("Cor:"+ gato.getCor());
        System.out.println("Sexo:"+ gato.getSexo());
        System.out.println("Peso:"+ gato.getRaca()+ "kg");
        System.out.println("Seu comportamento é:"+ gato.getComportamento());


    }
}