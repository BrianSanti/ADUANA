package ENTITY;

/**
 *
 * @author BillyS
 */
public class IngresoProducto {
    private int id_Producto;
    private String Descripcion;
    private double PrecioUnitario;
    private int CantidadArt;
    private double IvaTotal;
    private double ImporteTotal;
    
    private int id_DPI;
    
    private int id_PAIS;
    private String NombrePais;
    private int RiesgoPais;
    
    private int id_TIPO;
    private String DescripcionProd;
    private int RiesgoProducto;
    
    
    public IngresoProducto() {
    }

    public IngresoProducto(int id_Producto, String Descripcion, double PrecioUnitario, int CantidadArt, double IvaTotal, double ImporteTotal, int id_DPI, int id_PAIS, String NombrePais, int RiesgoPais, int id_TIPO, String DescripcionProd, int RiesgoProducto) {
        this.id_Producto = id_Producto;
        this.Descripcion = Descripcion;
        this.PrecioUnitario = PrecioUnitario;
        this.CantidadArt = CantidadArt;
        this.IvaTotal = IvaTotal;
        this.ImporteTotal = ImporteTotal;
        this.id_DPI = id_DPI;
        
        this.id_PAIS = id_PAIS;
        this.NombrePais = NombrePais;
        this.RiesgoPais = RiesgoPais;
        
        this.id_TIPO = id_TIPO;
        this.DescripcionProd = DescripcionProd;
        this.RiesgoProducto = RiesgoProducto;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getCantidadArt() {
        return CantidadArt;
    }

    public void setCantidadArt(int CantidadArt) {
        this.CantidadArt = CantidadArt;
    }

    public double getIvaTotal() {
        return IvaTotal;
    }

    public void setIvaTotal(double IvaTotal) {
        this.IvaTotal = IvaTotal;
    }

    public double getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(double ImporteTotal) {
        this.ImporteTotal = ImporteTotal;
    }

    public int getId_DPI() {
        return id_DPI;
    }

    public void setId_DPI(int id_DPI) {
        this.id_DPI = id_DPI;
    }

    public int getId_PAIS() {
        return id_PAIS;
    }

    public void setId_PAIS(int id_PAIS) {
        this.id_PAIS = id_PAIS;
    }

    public String getNombrePais() {
        return NombrePais;
    }

    public void setNombrePais(String NombrePais) {
        this.NombrePais = NombrePais;
    }

    public int getRiesgoPais() {
        return RiesgoPais;
    }

    public void setRiesgoPais(int RiesgoPais) {
        this.RiesgoPais = RiesgoPais;
    }

    public int getId_TIPO() {
        return id_TIPO;
    }

    public void setId_TIPO(int id_TIPO) {
        this.id_TIPO = id_TIPO;
    }

    public String getDescripcionProd() {
        return DescripcionProd;
    }

    public void setDescripcionProd(String DescripcionProd) {
        this.DescripcionProd = DescripcionProd;
    }

    public int getRiesgoProducto() {
        return RiesgoProducto;
    }

    public void setRiesgoProducto(int RiesgoProducto) {
        this.RiesgoProducto = RiesgoProducto;
    }

    @Override
    public String toString() {
        return "IngresoProducto{" + "id_Producto=" + id_Producto + ", Descripcion=" + Descripcion + ", PrecioUnitario=" + PrecioUnitario + ", CantidadArt=" + CantidadArt + ", IvaTotal=" + IvaTotal + ", ImporteTotal=" + ImporteTotal + ", id_DPI=" + id_DPI + ", id_PAIS=" + id_PAIS + ", NombrePais=" + NombrePais + ", RiesgoPais=" + RiesgoPais + ", id_TIPO=" + id_TIPO + ", DescripcionProd=" + DescripcionProd + ", RiesgoProducto=" + RiesgoProducto + '}';
    }

    
}
