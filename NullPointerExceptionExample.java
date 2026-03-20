class NullPointerExceptionExample {
    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            System.out.println(s.length());
        } else {
            System.out.println("String is null");
        }
    }
}