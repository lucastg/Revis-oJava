package equipamento;


public class Equipamento {
    private int patr;
    private int data;
    private String desc;
    private String tipo;
    
    public Equipamento(int patr, int data, String desc, String tipo){
        this.patr = patr;
        this.data = data;
        this.desc = desc;
        this.tipo = tipo;
    }

    /**
     * @return the patr
     */
    public int getPatr() {
        return patr;
    }

    /**
     * @param patr the patr to set
     */
    public void setPatr(int patr) {
        this.patr = patr;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
