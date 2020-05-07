public class BatteryCharger {

    private int getChargingCost(int startHour, int chargeTime) {
        int totalCost = 0;
        for(int i = 0; i<chargeTime; i++) {

            totalCost+= rateTable[startHour];

            if(startHour == 23) {
                startHour = 0;
            }
            else {
                startHour++;
            }
        }
        return totalCost;
    }

    public int getChargeStartTime(int chargeTime) {
        int startHour = 0;
        for(int i = 1; i<24; i++) {
            if(getChargingCost(i, chargeTime) < getChargingCost(startHour, chargeTime)) {
                startHour = i;
            }
        }
        return startHour;
    }
}
