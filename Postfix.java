public class Postfix {
    private Stack<Integer> stack = new Stack<>();
    
    public int operate(String string){
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            try {
                this.stack.push(Integer.parseInt(words[i]));
            } catch (Exception e) {
                this.manageOperation(words[i]);
            }
        }
        if(this.stack.isEmpty()){return 0;}
        else{return stack.pop();}
    }

    private void sum(){
        this.stack.push(this.stack.pop() + this.stack.pop());
    }

    private void mult(){
        this.stack.push(this.stack.pop() * this.stack.pop());
    }

    private void mod(){
        var a = this.stack.pop();
        var b = this.stack.pop();
        this.stack.push(b%a);
    }

    private void rest(){
        this.stack.push(-this.stack.pop() + this.stack.pop());
    }

    private void div(){
        var a = this.stack.pop();
        var b = this.stack.pop();
        this.stack.push(b/a);
    }

    private void manageOperation(String operation) {
        switch (operation.toUpperCase()) { // Convertimos a mayúsculas para evitar problemas de formato
            case "+":
                this.sum();
                break;
            case "-":
                rest();
                break;
            case "*":
                mult();
                break;
            case "%":
                mod();
                break;
            case "/":
                div();
                break;
            default:
                break;
        }
    }
}
