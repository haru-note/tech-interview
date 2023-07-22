package net.harunote.quiz.input;

class NumericInput extends TextInput {
    static String numberInput = "";

    @Override
    public void add(char c) {
        if (Character.isDigit(c)){
            numberInput += c;
        }
    }

    @Override
    public String getValue() {
        return numberInput;
    }
}

