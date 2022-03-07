# ecosystem simulation

- goal: ecosystem simulation
- simulation: concerns one ecosystem
- ecosystem: list of its pests
- pests types: rat - pigeon - zombie
- pests attributes: speed - position - status

### pest interactions
- zombies contaminate anything adjacent to them, making it another zombie
- rats and pigeons fight for death (either one must die)

## ecosystem setup
Different ecosystem scenari should be simulated
- Random: pests chosen randomly
- UmbrellaCorp: 50% zombies at least
- Urban: rats and pigeons only (random)

## mutant pigeons
Some pigeons may become able to survive a rat attack
- implement with `Decorator` design pattern

## pacifist pest
Some pests may become non-violent and always try to flee antagonists
- implement this data to the simulation so its impact can be evaluated
- use `Strategy` design pattern
