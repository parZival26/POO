class Vuelo:
    def __init__(self, capacidad):
        self.capacidad = capacidad
        self.asientos = [Asiento(i, "Empresarial", True) for i in range(capacidad)]

class Asiento:
    def __init__(self, numero, tipo, disponibilidad):
        self.numero = numero
        self.tipo = tipo
        self.disponibilidad = disponibilidad

    def __str__(self) -> str:
        return f"Numero: {self.numero} Tipo: {self.tipo} Disponibilidad: {self.disponibilidad}"

class Tiquete:
    def __init__(self, pasajero, avion):
        self.pasajero = pasajero
        self.avion = avion
        self.asiento = self.avion.asientos[1]


avion_avianca = Vuelo(10)
tiquete_avianca = Tiquete("Juan", avion_avianca)
print(tiquete_avianca.asiento)

        
    
