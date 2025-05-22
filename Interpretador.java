class Interpretador {
    Interpretador() {
    }

    public static void main(String[] var0) {
        ArvoreSintatica var1 = null;

        try {
            AnaliseLexica var2 = new AnaliseLexica(var0[0]);
            Parser var3 = new Parser(var2);
            var1 = var3.parseProg();
            interpAvalia var4 = new interpAvalia();
            Float var5 = var4.avalia(var1);
            System.out.println(var5);
        } catch (Exception var6) {
            System.out.println("Erro de compilação:\n" + String.valueOf(var6));
        }

    }
}
