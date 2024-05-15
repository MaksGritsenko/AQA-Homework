package homeworks;

public class BusinessCard {
    public static void main(String[] args) {

        String fieldAge = "Age:";
        String fieldName = "Name:";
        String fieldCity = "City:";
        String fieldNumber = "Number:";
        String fieldSurname = "Surname:";
        String fieldCompany = "Company:";
        String fieldPosition = "Position:";
        String fieldAboutMe = "About me:";

        int age = 27;
        boolean yes = true;
        String city = "Kyiv";
        String name = "Maksym";
        long number = 380955090797L;
        String surname = "Hrytsenko";
        String position = "AQA Engineer";
        String company = "Hillel IT School";
        String mainText = "Hey, that's my calling card.";
        String aboutMe = "If you ask me if I'm afraid of spiders, I'd say:";

        System.out.println(mainText + "\n" + "\n"
                + fieldName + name + "\n"
                + fieldSurname + surname + "\n"
                + fieldAge + age + "\n" + fieldCompany + company + "\n"
                + fieldPosition + position + "\n"
                + fieldNumber + number + "\n"
                + fieldCity + city + "\n" + fieldAboutMe + aboutMe + yes);
    }
}
