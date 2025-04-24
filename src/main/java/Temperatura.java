
public class Temperatura {
    //Atributo privado para armazenar temperatura - celcius 
    private double tempCelsius;
            
    //construtor - criar objeto com temp inicial
    public Temperatura(double inicialTemp){
        this.tempCelsius = inicialTemp;
    }
    //GETTER - Para ler a temperatura
        public double getTemperaturaCelsius(){
            return tempCelsius;
        }
               
    //SETTER - para mudar a temperatura
        public void setTemperaturaCelsius (double mudarTempCelsius){
            this.tempCelsius = mudarTempCelsius;
    }
        //
        public double converterParaFahrenheit(){
            return(tempCelsius*9/5)+32; 
        }
        
        public double converteParaKelvin(){
            return tempCelsius+273.15;
        }
}
