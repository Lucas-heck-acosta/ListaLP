package exercicios;

public class Ex16 {

    public static void main(String[] args) {
        float janeiro = 15000f;
        float fevereiro = 23000f;
        float marco = 17000f;

        DespesasTrimestrais despesasTrimestrais = new DespesasTrimestrais(janeiro, fevereiro, marco);

        System.out.println("Despesas totais: " + despesasTrimestrais.despesaTotal());
        System.out.println("Media mensal: " + despesasTrimestrais.mediaMensal());
    }
}


class DespesasTrimestrais {
    private float mes1;
    private float mes2;
    private float mes3;

    public DespesasTrimestrais(float mes1, float mes2, float mes3) {
        this.mes1 = mes1;
        this.mes2 = mes2;
        this.mes3 = mes3;
    }

    public float despesaTotal()
    {
        return mes1 + mes2 + mes3;
    }

    public float mediaMensal()
    {
        return despesaTotal() / 3;
    }
}