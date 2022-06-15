/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.decorators;

/**
 *
 * @author Teddy Fer
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
