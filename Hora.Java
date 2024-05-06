//Elaborado por Eduardo Barbosa Rodrigues e Vinicius Pontes Oliva.

import java.util.Scanner;

public class Hora {

    Scanner scan = new Scanner(System.in);

    private int hora;
    private int min;
    private int seg;

    public Hora() {
        System.out.print("Classe Hora: ");
        // Hrs
        System.out.print("\nDigite um valor para a(s) hora(s): ");
       
        int Hora = scan.nextInt();// Lê o valor digitado pelo usuário e o armazena na variável 'Hora'

        while (Hora < 0 || Hora > 23) // Este loop previne que a hora seja negativa ou maior que 23h
        {
            System.out.println("Horas inválidas. Por favor, digite novamente. ");                      
            Hora = scan.nextInt();
        }
        this.hora = Hora; 

        // min
        System.out.print("\nDigite um valor para o(s) minuto(s): ");
        int Min = scan.nextInt();// Lê o valor digitado pelo usuário e o armazena na variável 'Min'

        while (Min < 0 || Min > 59)// Este loop previne que os minutos digitados sejam entre 0 e 59
        {
            System.out.println("Minutos inválidos. Por favor, digite novamente:");
            Min = scan.nextInt();
        }
        this.min = Min;
        // seg
        System.out.print("\nDigite um valor para o(s) segundo(s): ");
        int Seg = scan.nextInt();

        while (Seg < 0 || Seg > 59)//  Este loop previne que os segundos digitados sejam entre 0 e 59
        {
            System.out.println("Segundos inválidos. Por favor, digite novamente:");
            Seg = scan.nextInt();
        }
        this.seg = Seg;
    }

    // Construtor da classe Hora que recebe: h (hora), m (minuto) e s (segundo)
    public Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);
    }

    // Método para definir o valor das horas
    public void setHor(int h) {
        if (h >= 0 && h < 24)// Verifica se as horas estão dentro do que é válido
            this.hora = h;

        else
            System.out.println("Valor invalido. O valor das horas deve estar entre 0 e 23.");
    }

    // Método para definir o valor dos minutos
    public void setMin(int m) {
        if (m >= 0 && m < 60) // Verifica se os minutos estão dentro do que é válido
            this.min = m;

        else
            System.out.println("Valor invalido. O valor dos minutos deve estar entre 0 e 59.");
    }

    // Método para definir o valor dos segundos
    public void setSeg(int s) {
        if (s >= 0 && s < 60)
            this.seg = s;

        else
            System.out.println("Valor invalido. O valor dos segundos deve estar entre 0 e 59.");
    }

    // Método para definir o valor das horas através de entrada do usuário
    public void setHor() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor para a(s) hora(s): ");
        int horas = scan.nextInt();

        while (horas < 0 || horas > 23)
        {
            System.out.print("Entrada inválida. Digite novamente");
            horas = scan.nextInt();
        }

        this.hora = horas;
        scan.close();
    }

    // Método para definir o valor dos minutos através de entrada do usuário
    public void setMin() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor para o(s) minuto(s): ");
        int minutos = scan.nextInt();

        while (minutos < 0 || minutos > 59) {
            System.out.print("Valor invalido. Digite novamente");
            minutos = scan.nextInt();
        }

        this.min = minutos;
        scan.close();
    }

    // Método para definir o valor dos segundos através de entrada do usuário
    public void setSeg() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o(s) segundo(s): ");
        int segundos = scan.nextInt();

        while (segundos < 0 || segundos > 59) {
            System.out.print("Valor inválido. Digite novamente");
            segundos = scan.nextInt();
        }

        this.seg = segundos;
        scan.close();
    }

    // Método para obter o valor das horas
    public int getHor() {
        return this.hora;
    }

    // Método para obter o valor dos minutos
    public int getMin() {
        return this.min;
    }

    // Método para obter o valor dos segundos
    public int getSeg() {
        return this.seg;
    }

    // Método para obter a hora no formato HH:MM:SS
    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    // Método para obter a hora no formato HH:MM:SS AM/PM (12 horas)
    public String getHora2() {
        // Determina se é AM ou PM com base na hora
        String periodo = (hora < 12) ? "AM" : "PM";

        // Converte a hora para o formato de 12 horas
        int hora12 = (hora < 12) ? hora : hora - 12;

        // Se a hora for 0 (meia-noite), converte para 12 horas
        if (hora12 == 0)
            hora12 = 12;

        return String.format("%02d:%02d:%02d %s", hora12, min, seg, periodo);
    }

    // Método para obter o total de segundos desde a meia-noite
    public int getSegundos() {
        // Calcula o total de segundos somando horas * 3600, minutos * 60 e segundos
        return hora * 3600 + min * 60 + seg;
    }
}
