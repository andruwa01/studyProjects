package lesson16.hometask16;

public class HomeTask16 {
    static void email(String emailAddresses){
        int starti = 0;
        int endi = 0;
        for (int i = 0; i < emailAddresses.length(); i++){
            char isym = emailAddresses.charAt(i);
            if (isym == '@'){
                starti = i + 1;
            }
            if (isym == ';'){
                endi = i;
                String site = emailAddresses.substring(starti, endi);
                System.out.println(site);
                System.out.println(site.length());
                for (int j = 0; j < site.length(); j++){
                    char jsym = site.charAt(j);
                    if (jsym == '.'){
                        System.out.println(site.substring(0, j));
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; hello@gmail.com; bye@mail.ru; andrew@yahoo.com.ru;");
    }
}
