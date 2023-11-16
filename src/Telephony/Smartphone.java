package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for(String number : numbers) {
            if(!hasOnlyDigits(number)) {
                sb.append("Invalid number!").append(System.lineSeparator());
            } else {
                sb.append(String.format("Calling... %s%n", number));
            }
        }
        return sb.toString();
    }

    private boolean hasOnlyDigits(String number) {
        for(char singleChar: number.toCharArray()) {
            if(!Character.isDigit(singleChar)) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for(String url : urls) {
            if(hasDigits(url)) {
                sb.append("Invalid URL!").append(System.lineSeparator());
            } else {
                sb.append(String.format("Browsing: %s!%n", url));
            }
        }
        return sb.toString();
    }

    private boolean hasDigits(String url) {
        for(char singleChar: url.toCharArray()) {
            if(Character.isDigit(singleChar)) {
                return true;
            }
        }
        return false;
    }
}
