package WorkingWithAbstraction.TrafficLights;

public class TrafficLight {
    private Color currentColor;

    public TrafficLight(Color currentColor) {
        this.currentColor = currentColor;
    }


    public  void changeColor (){
      switch (currentColor){
          case RED:
              currentColor= Color.GREEN;
              break;
          case GREEN:
              currentColor= Color.YELLOW;
              break;
          case YELLOW:
              currentColor= Color.RED;
              break;
      }
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }
}
