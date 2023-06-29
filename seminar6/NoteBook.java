import java.sql.Time;
import java.util.Objects;

/**
 * NoteBook
 */
public class NoteBook {

    
    private long id;
    private String manufacturer;
    private String model;
    private String color;
    private String displaySize;
    private String screenResolution;
    private int memoryCapacity;
    private int diskCapacity;
    private String OS;
    private double price;


    public NoteBook(long id, String manufacturer, String model, String color, String displaySize, String screenResolution, int memoryCapacity, int diskCapacity, String OS, double price) {

        this.id = id;
        if(manufacturer.length() > 0) {
            this.manufacturer = manufacturer;            
        } else {
            this.manufacturer = "Unknown";
        }

        if(model.length() > 0) {
            this.model = model;            
        } else {
            this.model = "Unknown";
        }

        this.color = color;
        
        if(displaySize.length() > 0) {
            this.displaySize = displaySize;            
        } else {
            this.displaySize = "Unknown";
        }

        if(screenResolution.length() > 0) {
            this.screenResolution = screenResolution;            
        } else {
            this.screenResolution = "Unknown";
        }

        this.memoryCapacity = memoryCapacity;

        this.diskCapacity = diskCapacity;

        if(OS.length() > 0) {
            this.OS = OS;
        } else {
            this.OS = "Unknown";
        }

        if(price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
        
    }

    public long getId() {
      return id;  
    } 
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
    
    public String getColor() {
        return color;       
    }    
 
    public String getDisplaySize() {
        return displaySize;    
    }
    
    public String getScreenResolution() {
        return screenResolution;    
    }
    
    public int getMemoryCapacity() {
        return memoryCapacity;
    }
    
    public int getDiskCapacity() {
        return diskCapacity;    
    }
    
    public String getOS() {
        return OS;    
    }
    
    public double getPrice() {
        return price;    
    }
    
    public void setId(long id) {
        if (id > 0) {
            this.id = id;
        }
        else {
            id = -1;
        }
      } 
      public void setManufacturer(String manufacturer) {
          if (manufacturer.length() > 0) {
            this.manufacturer = manufacturer;
          }
          else {
            this.manufacturer = "Unknown";
          }
      }
  
      public void setModel(String model) {
          if (model.length() > 0) {
            this.model = model;
          }
          else {
            model = "Unknown";
          }
      }
      
      public void setColor(String color) {
          this.color = color;
      }    
   
      public void setDisplaySize(String displaySize) {
          if (displaySize.length() > 0 ) {
            this.displaySize = displaySize;
          }
      }
      
      public void setScreenResolution(String screenResolution) {
          if (screenResolution.length() > 0) {
            this.screenResolution = screenResolution;
          }
          else {
            this.screenResolution = "Unknown";
          }
      }
      
      public void setMemoryCapacity(int memoryCapacity) {
          if (memoryCapacity > 0) {
            this.memoryCapacity = memoryCapacity;
          } else {
            memoryCapacity = -1;
          }
      }
      
      public void setDiskCapacity(int diskCapacity) {
          if(diskCapacity > 0) {
            this.diskCapacity = diskCapacity;
          } else {
            this.diskCapacity = -1;
          }
      }
      
      public void setOS(String OS) {
          if(OS.length() > 0) {
            this.OS = OS;
          } else {
            this.OS = "Unknown";
          }
      }
            
      public void setPrice(double price) {
          if (price > 0) {
            this.price = price;
          }else {
            this.price = 0;
          }
      }

    @Override
    public String toString() {

        return "Характеристики устройства: "
             + "\nid = " + id
             + "\nПроизводитель: " + manufacturer
             + "\nМодель: = " + model
             + "\nЦвет: = " + color
             + "\nРазмер экрана: = " + displaySize + "\""
             + "\nРазрешение: = " + screenResolution
             + "\nОбъём памяти: = " + memoryCapacity + " Mb"
             + "\nЁмкость диска: = " + diskCapacity + " Mb"
             + "\nОперационная система: = " + OS
             + "\nСтоимость: = " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        NoteBook nb = (NoteBook) obj;
        return manufacturer == nb.manufacturer && model == nb.model && color == nb.color && displaySize == nb.displaySize && screenResolution == nb.screenResolution;
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(manufacturer, model, color, displaySize, screenResolution);
    }
}