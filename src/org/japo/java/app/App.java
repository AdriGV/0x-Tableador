/* 
 * Copyright 2019 AdrianGV adrian.gimeno.alum@iescamp.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;
import org.japo.java.libraries.UtilesEntrada;
import org.japo.java.libraries.UtilesBasesNum;
/**
 *
 * @author CicloM
 */
public final class App {
    public static final String MSG_NUM ="Introduzca el numero (decimal) máximo..:";
    public static final String MSG_ERR ="Esto es un bonito ERROR";
    
    public final void launchApp() {
        
        System.out.println("Creador de Tablas de bases númericas");
        System.out.println("====================================");

        int numRangoMax = UtilesEntrada.leerNumero(MSG_NUM, MSG_ERR);
        
        for (int i = 0 ; i <= numRangoMax;i++){
//             System.out.printf("0b%-17s ", Integer.toBinaryString(i));
        System.out.printf("0b%s  0%s  %d 0x%S%n", UtilesBasesNum.decABin(i),
                UtilesBasesNum.decAOct(i), i, UtilesBasesNum.decAHex(i));
        }
    }
}
