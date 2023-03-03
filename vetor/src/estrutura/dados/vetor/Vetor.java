package estrutura.dados.vetor;

public class Vetor {

    private String[] elements;
    private int size;

    public Vetor(int capacity){

        this.elements = new String[capacity];
        this.size = 0;
    }

    /**public void toAdd(String element){

        for(int i = 0; i<this.elements.length; i++){

            if (this.elements[i] == null){
                this.elements[i] = element;
                break;
            }
        }

     Esta versão do método funciona mas não é eficiente para vetores com quantidades gigantescas de posições.
    }**/

    public void toAdd(String element) throws Exception {

        if(this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
        }else{

            throw new Exception("A capacidade do vetor chegou no limite. Não é possível adiconar um novo elemento !!!");
        }


    }

}
