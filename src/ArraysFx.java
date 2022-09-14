public class ArraysFx {
    
    //construir uma função que calcule a média dos itens de uma array
    public static int mediaIdade(int[] idadeAlunos){
        int counter = 0;
        
        for(int i = 0; i < idadeAlunos.length; i++){
            counter += idadeAlunos[i];
        }
        
        return counter / idadeAlunos.length;

    }

    //construir outra função que verifique quantos alunos estão acima da media de idade
        public static int acimaMedia(int[] idadeAlunos, double media){
            int cont = 0;
            for(int i =  0; i < idadeAlunos.length; i++){
                if (idadeAlunos[i] > media){
                    cont++;
                }
            }
            return cont;
        }
    
    //criar uma array
        public static void main(String[] args) {
            int[] idadeAlunos = {12, 11, 13, 15, 12, 11};
            double media = mediaIdade(idadeAlunos);
            int qtdeAlunosAcimaMedia = acimaMedia(idadeAlunos, media);

            System.out.println("A média de idade de alunos é de " + media + ", e a quantidade de alunos acima da media de idade é " + qtdeAlunosAcimaMedia);

        }
    
}
