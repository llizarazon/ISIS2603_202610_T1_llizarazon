# Taller Persistencia

## Explicación

### Relación OneToMany / ManyToOne (Director – Movie)

- La relación entre DirectorEntity y MovieEntity se modeló como OneToMany / ManyToOne debido a que un director puede estar asociado a múltiples películas, mientras que cada película tiene un único director. Esta decisión refleja correctamente la cardinalidad del dominio y permite mantener una estructura clara en la base de datos. En este caso, MovieEntity es la entidad dueña de la relación, por lo que la clave foránea se almacena en la tabla de películas. El uso de mappedBy en DirectorEntity indica que esta entidad no gestiona la relación directamente, evitando la creación de columnas adicionales o tablas innecesarias en la base de datos.

### Relación ManyToMany (Movie – Genre)

- La relación entre MovieEntity y GenreEntity se definió como ManyToMany, ya que una película puede pertenecer a múltiples géneros y un género puede estar asociado a múltiples películas. Al utilizar mappedBy en GenreEntity, se establece que MovieEntity es la entidad propietaria de la relación. Como resultado, JPA crea automáticamente una tabla intermedia en la base de datos que contiene únicamente las claves foráneas de ambas entidades. Esta tabla permite representar la relación sin duplicar información y es gestionada completamente por JPA, por lo que no es necesario interactuar directamente con ella.

### Relación OneToOne (Movie – Script)

- La relación entre MovieEntity y ScriptEntity se modeló como OneToOne, dado que cada película posee un único guion y cada guion pertenece exclusivamente a una sola película. En esta relación, MovieEntity actúa como la entidad propietaria y almacena la clave foránea correspondiente. El uso de mappedBy en ScriptEntity indica que esta entidad no controla la relación. Además, se configuró el uso de cascade = CascadeType.ALL y orphanRemoval = true para asegurar que, al eliminar una película, el script asociado también sea eliminado automáticamente, manteniendo la integridad referencial y evitando registros huérfanos en la base de datos.


## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back

