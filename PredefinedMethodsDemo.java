public static void main(String[] args) {
        System.out.println("---1.MATH METHODS---");
        int largest=Math.max(10,20);
        System.out.println("Largest number is: "+largest);
        int smallest=Math.min(10,20);
        System.out.println("Smallest number is: "+smallest);    
        double squareRoot=Math.sqrt(25);
        System.out.println("Square root of 25 is: "+squareRoot);
        double power=Math.pow(2,3);
        System.out.println("2 raised to the power 3 is: "+power);
        int absoluteValue=Math.abs(-10);
        System.out.println("Absolute value of -10 is: "+absoluteValue);
        System.out.println("---2.STRING METHODS---");
        String message="LearnJava";
        int length=message.length();
        System.out.println("Length of the text is: "+length);
        String upperCase=message.toUpperCase();
        System.out.println("Uppercase of the text is: "+upperCase);
        String lowerCase=message.toLowerCase();
        System.out.println("Lowercase of the text is: "+lowerCase);
        char character=message.charAt(0);
        System.out.println("Character at index 0 is: "+character);
        boolean contains=message.contains("Java");
        System.out.println("Does the text contain 'Java'? "+contains);
        
    }
}