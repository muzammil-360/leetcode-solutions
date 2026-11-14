class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] month_array={0,31,59,90,120,151,181,212,243,273,304,334,365};

        int days=day-1;
        int months=month_array[month-1];
        int years=(year-1971)*365;

        // int leap=((year-1)-1971)/4;
        int y = year - 1;
        int leap = (y / 4 - y / 100 + y / 400)- (1970 / 4 - 1970 / 100 + 1970 / 400);
        if (month > 2 && year % 4 == 0 &&
            (year % 100 != 0 || year % 400 == 0)) {
            leap++;
        }

        int ans=(days+months+years+leap)%7;
        if(ans==0){return "Friday";}
        else if(ans==1){return "Saturday";}
        else if(ans==2){return "Sunday";}
        else if(ans==3){return "Monday";}
        else if(ans==4){return "Tuesday";}
        else if(ans==5){return "Wednesday";}
        else if(ans==6){return "Thursday";}
        return "";
    }
}