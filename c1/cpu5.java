public class CPU {
private double price;
private Processor processor;
private RAM ram;
public CPU(double price, Processor processor, RAM ram) {
this.price = price;
this.processor = processor;
this.ram = ram;
}
public double getPrice() {
return price;
}
public Processor getProcessor() {
return processor;
}
public RAM getRam() {
return ram;
}
public static class Processor {
private int numberOfCores;
private String manufacturer;
public Processor(int numberOfCores, String manufacturer) {
this.numberOfCores = numberOfCores;
this.manufacturer = manufacturer;
}
public int getNumberOfCores() {
return numberOfCores;
}
public String getManufacturer() {
return manufacturer;
}
}
public static class RAM {
private int memory;
public class CPU {
private double price;
private Processor processor;
private RAM ram;
public CPU(double price, Processor processor, RAM ram) {
this.price = price;
this.processor = processor;
this.ram = ram;
}
public double getPrice() {
return price;
}
public Processor getProcessor() {
return processor;
}
public RAM getRam() {
return ram;
}
public static class Processor {
private int numberOfCores;
private String manufacturer;
public Processor(int numberOfCores, String manufacturer) {
this.numberOfCores = numberOfCores;
this.manufacturer = manufacturer;
}
public int getNumberOfCores() {
return numberOfCores;
}
public String getManufacturer() {
return manufacturer;
}
}
public static class RAM {
private int memory;
