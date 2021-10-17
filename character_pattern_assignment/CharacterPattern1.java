class CharacterPattern1 {
    public static void main(String[] args) {
    int n = 6;
    int character = 65;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((char)character);
            }
            character++;
             System.out.println();
        }
    }
	}
