public class BalanceFactory {
    public static IBalanca<Produto> getBalanca(TipoBalanca tipo) {
        switch (tipo) {
            case TOLEDO_MGV6:
                return new ToledoMGV6();
            case FILIZOLA_SMART:
                return new CustomFilizolaSmart();
            case URANO_INTEGRA:
                return new UranoIntegra();
            default:
                throw new IllegalArgumentException("Tipo de balança desconhecido: " + tipo);
        }
    }
}

