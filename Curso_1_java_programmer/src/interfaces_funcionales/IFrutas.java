package interfaces_funcionales;

import java.util.List;

@FunctionalInterface
public interface IFrutas {

    List<Fruta> operacionesFrutas(List<Fruta> frutas);
}
