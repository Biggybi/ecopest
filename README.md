# ecosystem simulation

## first version
- goal: ecosystem simulation
- simulation: concerns one ecosystem
- ecosystem: list of its pests
- pets: speed - position - status | rat - pigeon - zombie

- must show a simulation over time

### pest interactions
- zombies contaminate anything adjacent to them (become zombie as well)
- rats and pigeon fight for death (either one must die)

## ecosystem build implementation
different ecosystems can be simulated
- Random: pests chosen randomly
- UmbrellaCorp: 50% zombies at least
- Urban: rats and pigeons only (random)

## mutant pigeons
some pigeons may become able to survive a rat attack
- implement with `Decorator` design pattern

## pacifist pest
some pests may become non-violent and always try to flee antagonists
- implement this data to the simulation so its impact can be evaluated
- use `Strategy` design pattern
