public interface interfejsik<T> {
    int wiek = 10;
    void metoda(T parametr);
    void metoda3(String pare);
    default int metoda2(int parametr){
        return 0;
    }
}
