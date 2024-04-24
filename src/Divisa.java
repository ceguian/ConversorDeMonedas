public class Divisa {
    private String base_code;
    private String target_code;
    private double conversion_result;


    public Divisa(DivisaApi divisaApi) {
        this.base_code = divisaApi.base_code();
        this.target_code = divisaApi.target_code();
        this.conversion_result = divisaApi.conversion_result();
    }

    @Override
    public String toString() {
        return  "" + conversion_result;

    }
}
