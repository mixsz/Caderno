import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aaa erros = new Aaa();
        System.out.println("Número");
        try{
            int x = input.nextInt();
            erros.sla(x);
        }
        catch(Exception e){
            System.out.println("Erro encontrado!\n"+e);
        }
       finally{
        input.close();
       }
    }
}
#include <iostream>
using namespace std;

int main() {
    string lixo;
    int dia_inicio, dia_fim;
    int h_inicio, m_inicio, s_inicio;
    int h_fim, m_fim, s_fim;

    // Leitura do início
    cin >> lixo >> dia_inicio; // "Dia" lixo, dia lido
    cin >> h_inicio >> lixo >> m_inicio >> lixo >> s_inicio; // hora : minuto : segundo

    // Leitura do fim
    cin >> lixo >> dia_fim;
    cin >> h_fim >> lixo >> m_fim >> lixo >> s_fim;

    // Converter todo o tempo para segundos
    int inicio_total = dia_inicio * 24 * 3600 + h_inicio * 3600 + m_inicio * 60 + s_inicio;
    int fim_total = dia_fim * 24 * 3600 + h_fim * 3600 + m_fim * 60 + s_fim;

    int duracao = fim_total - inicio_total;

    // Agora, quebrar a duração em dias, horas, minutos e segundos
    int dias = duracao / (24 * 3600);
    duracao %= (24 * 3600);
    int horas = duracao / 3600;
    duracao %= 3600;
    int minutos = duracao / 60;
    int segundos = duracao % 60;

    cout << dias << " dia(s)" << endl;
    cout << horas << " hora(s)" << endl;
    cout << minutos << " minuto(s)" << endl;
    cout << segundos << " segundo(s)" << endl;

    return 0;
}