package company;

public class Bus {
    private int NumberOfPlaces, PricePlace, TakenPlaces;

    public int getNumberOfPlaces() { return NumberOfPlaces; }
    public int getPricePlace() { return PricePlace; }
    public int getTakenPlaces() { return TakenPlaces; }

    public void setNumberOfPlaces(int NumberOfPlaces) { this.NumberOfPlaces = NumberOfPlaces; }
    public void setPricePlace(int PricePlace) { this.PricePlace = PricePlace; }
    public void setTakenPlaces(int TakenPlaces) { this.TakenPlaces = TakenPlaces; }

    public Bus() {
        NumberOfPlaces = 0;
        PricePlace = 0;
        TakenPlaces = 0;
    }

    public Bus(int NumberOfPlaces, int PricePlace, int TakenPlaces) {
        this.NumberOfPlaces = NumberOfPlaces;
        this.PricePlace = PricePlace;
        this.TakenPlaces = TakenPlaces;
    }

    //Метод, возвращающий количество свободных мест
    public int FreePlace (){
        return NumberOfPlaces - TakenPlaces;
    }

    //Метод проверяет, заполнен ли автобус
    public boolean FillBus (){
        if (NumberOfPlaces == TakenPlaces) { return true; }
        else return false;
    }

    //Метод, возвращающий общую стоимость занятых мест
    public int Price (){
        return TakenPlaces*PricePlace;
    }
}
