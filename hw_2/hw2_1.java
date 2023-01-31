public class HW2_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int count = 0;
        String test = "";
        String chr = "'";
        StringBuilder selectstr = new StringBuilder("select * from students where ");
        Character chr_use = chr.charAt(0);
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr_use) count++;
            if (count != 0) test = test + str.charAt(i);
            if (count == 2) {
                test = test + " ";
                count = 0;
        }
    }
    test = test.replace("'", "");
    String [] strSplit = test.split(" ");
    for (int i = 0; i+2< strSplit.length; i++) {
        if (!strSplit[i+1].equals("null")){
            //i= i+2;
            System.out.println(strSplit[i]);
            System.out.println("kkk");
            selectstr.append('"');
            selectstr.append(strSplit[i]);
            selectstr.append('"');
            if (i%2 == 0) selectstr.append('=');
            if (i%2 != 0 && i+3 != strSplit.length) selectstr.append(" and ");
        }
    }
    System.out.println(selectstr);
}
}
