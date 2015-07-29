#include "Juguete.h"

/// class Proveedor - 
class Proveedor {
  // Attributes
private:
  int id;
  Juguete juguetes[];
  // Operations
public:
  int getCodigo ();
  void setCodigo (int i);
  Juguete getJuguetes ();
  void agregarJuguete (Juguete j);
  void eliminarJuguete (Juguete j);
};

