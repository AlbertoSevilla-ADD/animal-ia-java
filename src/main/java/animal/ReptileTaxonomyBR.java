package animal;

import animal.rule.*;
import animal.rule.Condition;

public class ReptileTaxonomyBR {

   /* private static final String SI = "si";
    private static final String NO = "no";*/

    BooleanRuleBase br = new BooleanRuleBase("reptileTaxonomy");
    
    //DECLARACIÓN DE VARIABLES DE REGLA
    //para todos los niveles taxonómicos
    
    // REINO
    RuleVariable Unicelulares, Fotosintesis, Esporas, AmbientesExtremos, MovilidadActiva;
    RuleVariable Reino;

    // FILO
    RuleVariable SimetriaRadial, TejidosVerdaderos, Segmentacion, DigestivoCompleto;
    RuleVariable Notocorda, ConchaCalcarea, Quetas;
    RuleVariable Filo;

    // CLASE
    RuleVariable SangreFria, HuevoAmniotico, GarrasDedos, CorazonTresCamaras;
    RuleVariable PielSecaEscamosa, Mandibulas, AletasLobuladas, RadiosOseosAletas, EsqueletoOseo;
    RuleVariable Clase;

    // ORDEN
    RuleVariable FecundacionInterna, CaparazonOseo, MudaPiel, TercerOjoParietal, CuidadoParental;
    RuleVariable Orden;

    // FAMILIA Elapidae/Anguidae/Iguanidae/Amphisbaenidae/Dactyloidae
    RuleVariable DientesPleurodontes, LenguaCortaNoBifida, Termorregulador;
    RuleVariable EscamasEspinosas, ExtremidadesReducidas, OjosParpadosMoviles;
    RuleVariable PupilasVerticales, VenenoPotente, AutotomiaCaudal, HabitosArboricolas;
    RuleVariable Carnivoros, HuevosCascaraCalcarea;
    RuleVariable Familia;
    
    // FAMILIA Cheloniidae
    RuleVariable Marino, Terrestre, EscudosAusentes, CaparazonAlto, CaparazonAplanado;
    RuleVariable CabezaGrandeAlargada, HabitatPrincipalUSA, HabitatPrincipalAustralia;
    RuleVariable Familia1;
    

    // GÉNERO Bipes
    RuleVariable DosPatasTraseras, OjosReducidos, AdaptadoExcavar, CuerpoAlargadoCilindrico;
    RuleVariable SinPatas, Venenoso, PielOsteodermos, LagartosParpadosMoviles, Geckos;
    RuleVariable EspolonesPelvicos, EscamasVertHilerasTransv, EscamasDorsalesQuilladas;
    RuleVariable Genero;

    // GÉNERO CTENOSAURA
    RuleVariable Herbivoro, Omnivoro, CrestaDorsal, EspinosasCola, AdaptacionDesierto, Arboricola;
    RuleVariable EsTerrestre,EsMarino,EndemicoIslas, PeligroExtincion;
    RuleVariable Genero1;
    
    // GENERO Anolis
    RuleVariable Dactylidae,TieneLamelas, LengCortaNoBifida,EscamasEspecializadas, PapadaSuperReducida;
    RuleVariable CapacidadAutotomiaCaudal, PapadaExtensible, PapadaGrande, PorosFemorales;
    RuleVariable Genero2;
    
    //GENERO MICRURUS
    RuleVariable CuerpoCilindrico, PupilaRedonda, PatronAnillo, HabitatAcuatico;
    RuleVariable HabitatArboreo, ExpandeCuello, ColaComprimida, EscamasVentralesDesarrolladas;
    RuleVariable ActividadNocturna;
    RuleVariable Genero3;
    
    // GENERO ABRONIA
    RuleVariable PatasReducidasAusentes, ColaMuyFragil, EscamasEnFila, PliegueLateral,SinPatas1;
    RuleVariable ColaPrensil, HabitatAsiatico, TamanoPequeno, CuerpoDelgado, TamanoGrande, CuerpoLiso;
    RuleVariable Genero4;
    
    // GENERO CARETTA
    RuleVariable DistribucionTropical, DietaHerbivora, PicoFuerteCrustaceos, CaparazonAplanado1,DietaPastosMarinos;
    RuleVariable Genero5;
    
    // ESPECIE BIPES BIPORUS
    RuleVariable EndemicoMexico, PeninsulaBajaCalifornia, EstadoGuerrero, EstadoMichoacan;
    RuleVariable ChiapasGuatemala, HastaCostaRica, TamanoAdulto24cm, TamanoAdulto18cm;
    RuleVariable ColorUniformeOscuro, ColoracionRosadaPalida,AnillosCuerpo;
    RuleVariable Especie;
    
    //ESPECIE CTENOSAURA DEFENSOR
    RuleVariable ColaEspinosa, CorredoresVeloces, Diurnos, ColoracionOscura, CrestaAlta;
    RuleVariable ColaLarga, EspinasCortas, CincoCrestas, CrestaDividida, EscamasGrandes;
    RuleVariable DietaCarnivora, BandaPectoral, DorsoAmarillo;
    RuleVariable Especie1;
    
    //ESPECIE ANOLIS NAUFRAGUS
    RuleVariable ColorVerdePredominante,CrestDorsal,TamanioGrande, HabitatUrbano, DewlapRojo, EscamasRugosas;
    RuleVariable Especie2;
    
    //ESPECIE MICRURUS LATICOLLARIS
    RuleVariable AnillosTricolor, AnillosNegrosAnchos, CabezaNegra, ColaCorta;
    RuleVariable DistribucionCentroamerica, DistribucionSudamerica, DistribucionMexico;//EstadoOaxaca no es caracteristica
    RuleVariable HabitatSelva, HabitatBosqueSeco, HabitatAcuario, AnilloBlancoPresente;
    RuleVariable Especie3;
    
    //ESPECIE ABRONIA GRAMINEA
    RuleVariable ColoracionRojiza, ColoracionVerde, ColoracionEsmeralda, LabiosRojos;
    RuleVariable ColaOscura, BandaDorsal, CabezaAncha, OrejasVisibles, EscamasQuilladas, OjosGrandes;
    RuleVariable Especie4;
    
    // ESPECIE CARETTA CARETTA
    RuleVariable CabezaMuyGrande;
    RuleVariable Especie5;

    String resultadoClasificacion;

    public String getReino(String unicelulares, String fotosintesis, String esporas,
        String ambientesExtremos, String movilidadActiva){
        inicializarBR();
         // Establecer valores REINO
        Unicelulares.setValue(unicelulares);
        Fotosintesis.setValue(fotosintesis);
        Esporas.setValue(esporas);
        AmbientesExtremos.setValue(ambientesExtremos);
        MovilidadActiva.setValue(movilidadActiva);
        
        br.forwardChain();
        
        resultadoClasificacion=Reino.getValue();
        return resultadoClasificacion;
    }
    
    public String getFilo(String reino,String simetriaRadial, String tejidosVerdaderos, String segmentacion,
        String digestivoCompleto, String notocorda, String conchaCalcarea, String quetas){
        inicializarBR();
        // Establecer valores FILO
        Reino.setValue(reino);
        SimetriaRadial.setValue(simetriaRadial);
        TejidosVerdaderos.setValue(tejidosVerdaderos);
        Segmentacion.setValue(segmentacion);
        DigestivoCompleto.setValue(digestivoCompleto);
        Notocorda.setValue(notocorda);
        ConchaCalcarea.setValue(conchaCalcarea);
        Quetas.setValue(quetas);
        
        br.forwardChain();
        
        resultadoClasificacion=Filo.getValue();
        return resultadoClasificacion;
    }
    
    public String getClase(String filo,String sangreFria, String huevoAmniotico, String garrasDedos, String corazonTresCamaras,
        String pielSecaEscamosa, String mandibulas, String aletasLobuladas,
        String radiosOseosAletas, String esqueletoOseo){
        inicializarBR();
        // Establecer valores CLASE
        Filo.setValue(filo);
        SangreFria.setValue(sangreFria);
        HuevoAmniotico.setValue(huevoAmniotico);
        GarrasDedos.setValue(garrasDedos);
        CorazonTresCamaras.setValue(corazonTresCamaras);
        PielSecaEscamosa.setValue(pielSecaEscamosa);
        Mandibulas.setValue(mandibulas);
        AletasLobuladas.setValue(aletasLobuladas);
        RadiosOseosAletas.setValue(radiosOseosAletas);
        EsqueletoOseo.setValue(esqueletoOseo);
        
        br.forwardChain();
        
        resultadoClasificacion=Clase.getValue();
        return resultadoClasificacion;
    }
    
    public String getOrden(String clase,String fecundacionInterna, String caparazonOseo,
        String mudaPiel, String tercerOjoParietal, String cuidadoParental){
        inicializarBR();
        // Establecer valores ORDEN
        Clase.setValue(clase);
        FecundacionInterna.setValue(fecundacionInterna);
        CaparazonOseo.setValue(caparazonOseo);
        MudaPiel.setValue(mudaPiel);
        TercerOjoParietal.setValue(tercerOjoParietal);
        CuidadoParental.setValue(cuidadoParental);
        
        br.forwardChain();
        
        resultadoClasificacion=Orden.getValue();
        return resultadoClasificacion;
    }
    
    public String getFamilia(String orden,String dientesPleurodontes, String lenguaCortaNoBifida, String termorregulador,
        String escamasEspinosas, String extremidadesReducidas, String ojosParpadosMoviles,
        String pupilasVerticales, String venenoPotente, String autotomiaCaudal,
        String habitosArboricolas, String carnivoros, String huevosCascaraCalcarea){
        inicializarBR();
        // Establecer valores FAMILIA
        Orden.setValue(orden);
        DientesPleurodontes.setValue(dientesPleurodontes);
        LenguaCortaNoBifida.setValue(lenguaCortaNoBifida);
        Termorregulador.setValue(termorregulador);
        EscamasEspinosas.setValue(escamasEspinosas);
        ExtremidadesReducidas.setValue(extremidadesReducidas);
        OjosParpadosMoviles.setValue(ojosParpadosMoviles);
        PupilasVerticales.setValue(pupilasVerticales);
        VenenoPotente.setValue(venenoPotente);
        AutotomiaCaudal.setValue(autotomiaCaudal);
        HabitosArboricolas.setValue(habitosArboricolas);
        Carnivoros.setValue(carnivoros);
        HuevosCascaraCalcarea.setValue(huevosCascaraCalcarea);
        
        br.forwardChain();
        
        resultadoClasificacion=Familia.getValue();
        return resultadoClasificacion;
    }
    
    public String getFamilia1(String orden,String marino, String terrestre, String escudosAusentes,
        String caparazonAlto, String caparazonAplanado, String cabezaGrandeAlargada,
        String habitatPrincipalUSA, String habitatPrincipalAustralia){
        inicializarBR();
        // Establecer valores FAMILIA1
        Orden.setValue(orden);
        Marino.setValue(marino);
        Terrestre.setValue(terrestre);
        EscudosAusentes.setValue(escudosAusentes);
        CaparazonAlto.setValue(caparazonAlto);
        CaparazonAplanado.setValue(caparazonAplanado);
        CabezaGrandeAlargada.setValue(cabezaGrandeAlargada);
        HabitatPrincipalUSA.setValue(habitatPrincipalUSA);
        HabitatPrincipalAustralia.setValue(habitatPrincipalAustralia);
        
         br.forwardChain();
        
        resultadoClasificacion=Familia1.getValue();
        return resultadoClasificacion;
    }
    
    public String getGenero(String familia,String dosPatasTraseras, String ojosReducidos, String adaptadoExcavar,
        String cuerpoAlargadoCilindrico, String sinPatas, String venenoso,
        String pielOsteodermos, String lagartosParpadosMoviles, String geckos,
        String espolonesPelvicos, String escamasVertHilerasTransv, String escamasDorsalesQuilladas){
        inicializarBR();
        Familia.setValue(familia);
        DosPatasTraseras.setValue(dosPatasTraseras);
        OjosReducidos.setValue(ojosReducidos);
        AdaptadoExcavar.setValue(adaptadoExcavar);
        CuerpoAlargadoCilindrico.setValue(cuerpoAlargadoCilindrico);
        SinPatas.setValue(sinPatas);
        Venenoso.setValue(venenoso);
        PielOsteodermos.setValue(pielOsteodermos);
        LagartosParpadosMoviles.setValue(lagartosParpadosMoviles);
        Geckos.setValue(geckos);
        EspolonesPelvicos.setValue(espolonesPelvicos);
        EscamasVertHilerasTransv.setValue(escamasVertHilerasTransv);
        EscamasDorsalesQuilladas.setValue(escamasDorsalesQuilladas);
        
        br.forwardChain();
        
        resultadoClasificacion=Genero.getValue();
        return resultadoClasificacion;
    }
    
    public String getGenero1(String familia,String herbivoro, String omnivoro, String crestaDorsal, String espinosasCola,
        String adaptacionDesierto, String arboricola, String esTerrestre,
        String esMarino, String endemicoIslas, String peligroExtincion){
        inicializarBR();
        Familia.setValue(familia);
        Herbivoro.setValue(herbivoro);
        Omnivoro.setValue(omnivoro);
        CrestaDorsal.setValue(crestaDorsal);
        EspinosasCola.setValue(espinosasCola);
        AdaptacionDesierto.setValue(adaptacionDesierto);
        Arboricola.setValue(arboricola);
        EsTerrestre.setValue(esTerrestre);
        EsMarino.setValue(esMarino);
        EndemicoIslas.setValue(endemicoIslas);
        PeligroExtincion.setValue(peligroExtincion);
        
        br.forwardChain();
        
        resultadoClasificacion=Genero1.getValue();
        return resultadoClasificacion;
    }
    
    public String getGenero2(String familia,String dactyloidae, String tieneLamelas, String lengCortaNoBifida, 
        String escamasEspecializadas, String papadaSuperReducida,
        String capacidadAutotomiaCaudal, String papadaExtensible, String papadaGrande,
        String porosFemorales){
        inicializarBR();
        Familia.setValue(familia);
        Dactylidae.setValue(dactyloidae);
        TieneLamelas.setValue(tieneLamelas);
        LengCortaNoBifida.setValue(lengCortaNoBifida);
        EscamasEspecializadas.setValue(escamasEspecializadas);
        PapadaSuperReducida.setValue(papadaSuperReducida);
        CapacidadAutotomiaCaudal.setValue(capacidadAutotomiaCaudal);
        PapadaExtensible.setValue(papadaExtensible);
        PapadaGrande.setValue(papadaGrande);
        PorosFemorales.setValue(porosFemorales);
        br.forwardChain();
        
        resultadoClasificacion=Genero2.getValue();
        return resultadoClasificacion;
    }
    
    public String getGenero3(String familia, String cuerpoCilindrico, String pupilaRedonda, String patronAnillo,
        String habitatAcuatico, String habitatArboreo, String expandeCuello,
        String colaComprimida, String escamasVentralesDesarrolladas, String actividadNocturna){
        inicializarBR();
        Familia.setValue(familia);
        CuerpoCilindrico.setValue(cuerpoCilindrico);
        PupilaRedonda.setValue(pupilaRedonda);
        PatronAnillo.setValue(patronAnillo);
        HabitatAcuatico.setValue(habitatAcuatico);
        HabitatArboreo.setValue(habitatArboreo);
        ExpandeCuello.setValue(expandeCuello);
        ColaComprimida.setValue(colaComprimida);
        EscamasVentralesDesarrolladas.setValue(escamasVentralesDesarrolladas);
        ActividadNocturna.setValue(actividadNocturna);
        
        br.forwardChain();
        
        resultadoClasificacion=Genero3.getValue();
        return resultadoClasificacion;
    }
    
    public String getGenero4(String familia, String patasReducidasAusentes, String colaMuyFragil, String escamasEnFila,
        String pliegueLateral,String sinPatas, String colaPrensil, String habitatAsiatico,
        String tamanoPequeno, String cuerpoDelgado, String tamanoGrande, String cuerpoLiso){
        inicializarBR();
        Familia.setValue(familia);
        PatasReducidasAusentes.setValue(patasReducidasAusentes);
        ColaMuyFragil.setValue(colaMuyFragil);
        EscamasEnFila.setValue(escamasEnFila);
        PliegueLateral.setValue(pliegueLateral);
        SinPatas1.setValue(sinPatas);
        ColaPrensil.setValue(colaPrensil);
        HabitatAsiatico.setValue(habitatAsiatico);
        TamanoPequeno.setValue(tamanoPequeno);
        CuerpoDelgado.setValue(cuerpoDelgado);
        TamanoGrande.setValue(tamanoGrande);
        CuerpoLiso.setValue(cuerpoLiso);
                
        br.forwardChain();
        
        resultadoClasificacion=Genero4.getValue();
        return resultadoClasificacion;
    }
    
    public String getGenero5(String familia1, String distribucionTropical, String dietaHerbivora, String picoFuerteCrustaceos,
        String caparazonAplanado, String dietaPastosMarinos){
        inicializarBR();
        Familia1.setValue(familia1);
        DistribucionTropical.setValue(distribucionTropical);
        DietaHerbivora.setValue(dietaHerbivora);
        PicoFuerteCrustaceos.setValue(picoFuerteCrustaceos);
        CaparazonAplanado1.setValue(caparazonAplanado);
        DietaPastosMarinos.setValue(dietaPastosMarinos);
        br.forwardChain();
        
        resultadoClasificacion=Genero5.getValue();
        return resultadoClasificacion;
    }
    
    public String getEspecie(String genero, String endemicoMexico, String peninsulaBajaCalifornia, String estadoGuerrero,
        String estadoMichoacan, String chiapasGuatemala, String hastaCostaRica,
        String tamanoAdulto24cm, String tamanoAdulto18cm, String colorUniformeOscuro,
        String coloracionRosadaPalida, String anillosCuerpo){
        inicializarBR();
        Genero.setValue(genero);
        EndemicoMexico.setValue(endemicoMexico);
        PeninsulaBajaCalifornia.setValue(peninsulaBajaCalifornia);
        EstadoGuerrero.setValue(estadoGuerrero);
        EstadoMichoacan.setValue(estadoMichoacan);
        ChiapasGuatemala.setValue(chiapasGuatemala);
        HastaCostaRica.setValue(hastaCostaRica);
        TamanoAdulto24cm.setValue(tamanoAdulto24cm);
        TamanoAdulto18cm.setValue(tamanoAdulto18cm);
        ColorUniformeOscuro.setValue(colorUniformeOscuro);
        ColoracionRosadaPalida.setValue(coloracionRosadaPalida);
        AnillosCuerpo.setValue(anillosCuerpo);
        br.forwardChain();
        
        resultadoClasificacion=Especie.getValue();
        return resultadoClasificacion;
    }
    
    public String getEspecie1(String genero,String colaEspinosa, String corredoresVeloces, String diurnos,
        String coloracionOscura, String crestaAlta, String colaLarga,
        String espinasCortas, String cincoCrestas, String crestaDividida,
        String escamasGrandes, String dietaCarnivora, String bandaPectoral,
        String dorsoAmarillo){
        inicializarBR();
        Genero1.setValue(genero);
        ColaEspinosa.setValue(colaEspinosa);
        CorredoresVeloces.setValue(corredoresVeloces);
        Diurnos.setValue(diurnos);
        ColoracionOscura.setValue(coloracionOscura);
        CrestaAlta.setValue(crestaAlta);
        ColaLarga.setValue(colaLarga);
        EspinasCortas.setValue(espinasCortas);
        CincoCrestas.setValue(cincoCrestas);
        CrestaDividida.setValue(crestaDividida);
        EscamasGrandes.setValue(escamasGrandes);
        DietaCarnivora.setValue(dietaCarnivora);
        BandaPectoral.setValue(bandaPectoral);
        DorsoAmarillo.setValue(dorsoAmarillo);
        br.forwardChain();
        
        resultadoClasificacion=Especie1.getValue();
        return resultadoClasificacion;
    }
    
    public String getEspecie2(String genero, String colorVerdePredominante,String crestaDorsal,
        String tamanioGrande, String habitatUrbano, String dewlapRojo, String escamasRugosas){
        inicializarBR();
        Genero2.setValue(genero);
        ColorVerdePredominante.setValue(colorVerdePredominante);
        CrestaDorsal.setValue(crestaDorsal);
        TamanioGrande.setValue(tamanioGrande);
        HabitatUrbano.setValue(habitatUrbano);
        DewlapRojo.setValue(dewlapRojo);
        EscamasRugosas.setValue(escamasRugosas);
        br.forwardChain();
        
        resultadoClasificacion=Especie2.getValue();
        return resultadoClasificacion;
    }
    
    public String getEspecie3(String genero, String anillosTricolor, String anillosNegrosAnchos, String cabezaNegra,
        String colaCorta, String distribucionCentroamerica, String distribucionSudamerica,
        String distribucionMexico, String habitatSelva, String habitatBosqueSeco,
        String habitatAcuario, String anilloBlancoPresente){
        inicializarBR();
        Genero3.setValue(genero);
        AnillosTricolor.setValue(anillosTricolor);
        AnillosNegrosAnchos.setValue(anillosNegrosAnchos);
        CabezaNegra.setValue(cabezaNegra);
        ColaCorta.setValue(colaCorta);
        DistribucionCentroamerica.setValue(distribucionCentroamerica);
        DistribucionSudamerica.setValue(distribucionSudamerica);
        DistribucionMexico.setValue(distribucionMexico);
         //-------------------------------- Este no pertenece a las tablas
        HabitatSelva.setValue(habitatSelva);
        HabitatBosqueSeco.setValue(habitatBosqueSeco);
        HabitatAcuario.setValue(habitatAcuario);
        AnilloBlancoPresente.setValue(anilloBlancoPresente);

        br.forwardChain();
        
        resultadoClasificacion=Especie3.getValue();
        return resultadoClasificacion;
    }
    
    public String getEspecie4(String genero, String coloracionRojiza, String coloracionVerde, String coloracionEsmeralda,
        String labiosRojos, String colaOscura, String bandaDorsal,
        String cabezaAncha, String orejasVisibles, String escamasQuilladas,
        String ojosGrandes){
        inicializarBR();
        Genero4.setValue(genero);
        ColoracionRojiza.setValue(coloracionRojiza);
        ColoracionVerde.setValue(coloracionVerde);
        ColoracionEsmeralda.setValue(coloracionEsmeralda);
        LabiosRojos.setValue(labiosRojos);
        ColaOscura.setValue(colaOscura);
        BandaDorsal.setValue(bandaDorsal);
        CabezaAncha.setValue(cabezaAncha);
        OrejasVisibles.setValue(orejasVisibles);
        EscamasQuilladas.setValue(escamasQuilladas);
        OjosGrandes.setValue(ojosGrandes);

        br.forwardChain();
        
        resultadoClasificacion=Especie4.getValue();
        return resultadoClasificacion;
    }
    
    public String getEspecie5(String genero, String cabezaMuyGrande){
        inicializarBR();
        Genero5.setValue(genero);
        CabezaMuyGrande.setValue(cabezaMuyGrande);
        br.forwardChain();
        
        resultadoClasificacion=Especie5.getValue();
        return resultadoClasificacion;
    }

    public void inicializarBR() {
        // Instancias de todas las variables de regla
        // REINO
        Unicelulares = new RuleVariable(br, "Unicelulares");
        Fotosintesis = new RuleVariable(br, "Fotosintesis");
        Esporas = new RuleVariable(br, "Esporas");
        AmbientesExtremos = new RuleVariable(br, "AmbientesExtremos");
        MovilidadActiva = new RuleVariable(br, "MovilidadActiva");
        Reino = new RuleVariable(br, "Reino");

        // FILO
        SimetriaRadial = new RuleVariable(br, "SimetriaRadial");
        TejidosVerdaderos = new RuleVariable(br, "TejidosVerdaderos");
        Segmentacion = new RuleVariable(br, "Segmentacion");
        DigestivoCompleto = new RuleVariable(br, "DigestivoCompleto");
        Notocorda = new RuleVariable(br, "Notocorda");
        ConchaCalcarea = new RuleVariable(br, "ConchaCalcarea");
        Quetas = new RuleVariable(br, "Quetas");
        Filo = new RuleVariable(br, "Filo");

        // CLASE
        SangreFria = new RuleVariable(br, "SangreFria");
        HuevoAmniotico = new RuleVariable(br, "HuevoAmniotico");
        GarrasDedos = new RuleVariable(br, "GarrasDedos");
        CorazonTresCamaras = new RuleVariable(br, "CorazonTresCamaras");
        PielSecaEscamosa = new RuleVariable(br, "PielSecaEscamosa");
        Mandibulas = new RuleVariable(br, "Mandibulas");
        AletasLobuladas = new RuleVariable(br, "AletasLobuladas");
        RadiosOseosAletas = new RuleVariable(br, "RadiosOseosAletas");
        EsqueletoOseo = new RuleVariable(br, "EsqueletoOseo");
        Clase = new RuleVariable(br, "Clase");

        // ORDEN
        FecundacionInterna = new RuleVariable(br, "FecundacionInterna");
        CaparazonOseo = new RuleVariable(br, "CaparazonOseo");
        MudaPiel = new RuleVariable(br, "MudaPiel");
        TercerOjoParietal = new RuleVariable(br, "TercerOjoParietal");
        CuidadoParental = new RuleVariable(br, "CuidadoParental");
        Orden = new RuleVariable(br, "Orden");

        // FAMILIA Elapidae/Anguidae/Iguanidae/Amphisbaenidae/Dactyloidae
        DientesPleurodontes = new RuleVariable(br, "DientesPleurodontes");
        LenguaCortaNoBifida = new RuleVariable(br, "LenguaCortaNoBifida");
        Termorregulador = new RuleVariable(br, "Termorregulador");
        EscamasEspinosas = new RuleVariable(br, "EscamasEspinosas");
        ExtremidadesReducidas = new RuleVariable(br, "ExtremidadesReducidas");
        OjosParpadosMoviles = new RuleVariable(br, "OjosParpadosMoviles");
        PupilasVerticales = new RuleVariable(br, "PupilasVerticales");
        VenenoPotente = new RuleVariable(br, "VenenoPotente");
        AutotomiaCaudal = new RuleVariable(br, "AutotomiaCaudal");
        HabitosArboricolas = new RuleVariable(br, "HabitosArboricolas");
        Carnivoros = new RuleVariable(br, "Carnivoros");
        HuevosCascaraCalcarea = new RuleVariable(br, "HuevosCascaraCalcarea");
        Familia = new RuleVariable(br, "Familia");
        
        //FAMILIA CHELONIIDAE
        Marino = new RuleVariable(br, "Marino");
        Terrestre = new RuleVariable(br, "Terrestre");
        EscudosAusentes = new RuleVariable(br, "EscudosAusentes");
        CaparazonAlto = new RuleVariable(br, "CaparazonAlto");
        CaparazonAplanado = new RuleVariable(br, "CaparazonAplanado");
        CabezaGrandeAlargada = new RuleVariable(br, "CabezaGrandeAlargada");
        HabitatPrincipalUSA = new RuleVariable(br, "HabitatPrincipalUSA");
        HabitatPrincipalAustralia = new RuleVariable(br, "HabitatPrincipalAustralia");
        Familia1 =new RuleVariable(br, "Familia1");

        // GÉNERO BIPES
        DosPatasTraseras = new RuleVariable(br, "DosPatasTraseras");
        OjosReducidos = new RuleVariable(br, "OjosReducidos");
        AdaptadoExcavar = new RuleVariable(br, "AdaptadoExcavar");
        CuerpoAlargadoCilindrico = new RuleVariable(br, "CuerpoAlargadoCilindrico");
        SinPatas = new RuleVariable(br, "SinPatas");
        Venenoso = new RuleVariable(br, "Venenoso");
        PielOsteodermos = new RuleVariable(br, "PielOsteodermos");
        LagartosParpadosMoviles = new RuleVariable(br, "LagartosParpadosMoviles");
        Geckos = new RuleVariable(br, "Geckos");
        EspolonesPelvicos = new RuleVariable(br, "EspolonesPelvicos");
        EscamasVertHilerasTransv = new RuleVariable(br, "EscamasVertHilerasTransv");
        EscamasDorsalesQuilladas = new RuleVariable(br, "EscamasDorsalesQuilladas");
        Genero = new RuleVariable(br, "Genero");
        
        // GÉNERO CTENOSAURA
        Herbivoro = new RuleVariable(br, "Herbivoro");
        Omnivoro = new RuleVariable(br, "Omnivoro");
        CrestaDorsal = new RuleVariable(br, "CrestaDorsal");
        EspinosasCola = new RuleVariable(br, "EspinosasCola");
        AdaptacionDesierto = new RuleVariable(br, "AdaptacionDesierto");
        Arboricola = new RuleVariable(br,"Agricola");
        EsTerrestre = new RuleVariable(br,"EsTerrestre");
        EsMarino = new RuleVariable(br,"EsMarino");
        EndemicoIslas = new RuleVariable(br, "EndemicoIslas");
        PeligroExtincion = new RuleVariable(br, "PeligroExtincion");
        Genero1 = new RuleVariable(br,"Genero1");
        
        //GÉNERO ANOLIS
        Dactylidae = new RuleVariable(br,"Dactylidae");
        TieneLamelas = new RuleVariable(br, "TieneLamelas");
        LengCortaNoBifida = new RuleVariable(br,"LengCortaNoBifida");
        EscamasEspecializadas = new RuleVariable(br, "EscamasEspecializadas");
        PapadaSuperReducida = new RuleVariable(br, "PapadaSuperReducida");
        CapacidadAutotomiaCaudal = new RuleVariable(br, "CapacidadAutotomiaCaudal");
        PapadaExtensible = new RuleVariable(br, "PapadaExtensible");
        PapadaGrande = new RuleVariable(br, "PapadaGrande");
        PorosFemorales = new RuleVariable(br, "PorosFemorales");
        Genero2 = new RuleVariable(br,"Genero2");
        
        //GÉNERO MICRURUS
        CuerpoCilindrico = new RuleVariable(br, "CuerpoCilindrico");
        PupilaRedonda = new RuleVariable(br, "PupilaRedonda");
        PatronAnillo = new RuleVariable(br, "PatronAnillo");
        HabitatAcuatico = new RuleVariable(br, "HabitatAcuatico");
        HabitatArboreo = new RuleVariable(br, "HabitatArboreo");
        ExpandeCuello = new RuleVariable(br, "ExpandeCuello");
        ColaComprimida = new RuleVariable(br, "ColaComprimida");
        EscamasVentralesDesarrolladas = new RuleVariable(br, "EscamasVentralesDesarrolladas");
        ActividadNocturna = new RuleVariable(br, "ActividadNocturna");
        Genero3 = new RuleVariable(br,"Genero3");
        
        //GÉNERO ABROINIA
        PatasReducidasAusentes = new RuleVariable(br, "PatasReducidasAusentes");
        ColaMuyFragil = new RuleVariable(br, "ColaMuyFragil");
        EscamasEnFila = new RuleVariable(br, "EscamasEnFila");
        PliegueLateral = new RuleVariable(br, "PliegueLateral");
        SinPatas1 = new RuleVariable(br, "SinPatas");
        ColaPrensil = new RuleVariable(br, "ColaPrensil");
        HabitatAsiatico = new RuleVariable(br, "HabitatAsiatico");
        TamanoPequeno = new RuleVariable(br, "TamanoPequeno");
        CuerpoDelgado = new RuleVariable(br, "CuerpoDelgado");
        TamanoGrande = new RuleVariable(br, "TamanoGrande");
        CuerpoLiso = new RuleVariable(br, "CuerpoLiso");
        Genero4 = new RuleVariable(br,"Genero4");
        
        //GÉNERO CARETTA
        DistribucionTropical = new RuleVariable(br, "DistribucionTropical");
        DietaHerbivora = new RuleVariable(br, "DietaHerbivora");
        PicoFuerteCrustaceos = new RuleVariable(br, "PicoFuerteCrustaceos");
        CaparazonAplanado1 = new RuleVariable(br, "CaparazonAplanado1");
        DietaPastosMarinos = new RuleVariable(br, "DietaPastosMarinos");
        Genero5 = new RuleVariable(br,"Genero5");

        // ESPECIE BIPORUS
        EndemicoMexico = new RuleVariable(br, "EndemicoMexico");
        PeninsulaBajaCalifornia = new RuleVariable(br, "PeninsulaBajaCalifornia");
        EstadoGuerrero = new RuleVariable(br, "EstadoGuerrero");
        EstadoMichoacan = new RuleVariable(br, "EstadoMichoacan");
        ChiapasGuatemala = new RuleVariable(br, "ChiapasGuatemala");
        HastaCostaRica = new RuleVariable(br, "HastaCostaRica");
        TamanoAdulto24cm = new RuleVariable(br, "TamanoAdulto24cm");
        TamanoAdulto18cm = new RuleVariable(br, "TamanoAdulto18cm");
        ColorUniformeOscuro = new RuleVariable(br, "ColorUniformeOscuro");
        ColoracionRosadaPalida = new RuleVariable(br, "ColoracionRosadaPalida");
        AnillosCuerpo = new RuleVariable(br,"AnillosCuerpo");
        Especie = new RuleVariable(br, "Especie");
        
        // ESPECIE CTENOSAURA DEFENSOR
        ColaEspinosa = new RuleVariable(br, "ColaEspinosa");
        CorredoresVeloces = new RuleVariable(br, "CorredoresVeloces");
        Diurnos = new RuleVariable(br, "Diurnos");
        ColoracionOscura = new RuleVariable(br, "ColoracionOscura");
        CrestaAlta = new RuleVariable(br, "CrestaAlta");
        ColaLarga = new RuleVariable(br, "ColaLarga");
        EspinasCortas = new RuleVariable(br, "EspinasCortas");
        CincoCrestas = new RuleVariable(br, "CincoCrestas");
        CrestaDividida = new RuleVariable(br, "CrestaDividida");
        EscamasGrandes = new RuleVariable(br, "EscamasGrandes");
        DietaCarnivora = new RuleVariable(br, "DietaCarnivora");
        BandaPectoral = new RuleVariable(br, "BandaPectoral");
        DorsoAmarillo = new RuleVariable(br, "DorsoAmarillo");
        Especie1 = new RuleVariable(br, "Especie1");
        
        // ESPECIE ANOLIS NAUFRAGUS
        ColorVerdePredominante = new RuleVariable(br, "ColorVerdePredominante");
        CrestDorsal = new RuleVariable(br,"CrestDorsal");
        TamanioGrande = new RuleVariable(br,"TamanioGrande");
        HabitatUrbano = new RuleVariable(br, "HabitatUrbano");
        DewlapRojo = new RuleVariable(br, "DewlapRojo");
        EscamasRugosas = new RuleVariable(br, "EscamasRugosas");
        Especie2 = new RuleVariable(br, "Especie2");
        
        // ESPECIE MICRURUS LATICOLLARIS
        AnillosTricolor = new RuleVariable(br, "AnillosTricolor");
        AnillosNegrosAnchos = new RuleVariable(br, "AnillosNegrosAnchos");
        CabezaNegra = new RuleVariable(br, "CabezaNegra");
        ColaCorta = new RuleVariable(br, "ColaCorta");
        DistribucionCentroamerica = new RuleVariable(br, "DistribucionCentroamerica");
        DistribucionSudamerica = new RuleVariable(br, "DistribucionSudamerica");
        DistribucionMexico = new RuleVariable(br, "DistribucionMexico");
        //-----------------------No existe en la tabla
        HabitatSelva = new RuleVariable(br, "HabitatSelva");
        HabitatBosqueSeco = new RuleVariable(br, "HabitatBosqueSeco");
        HabitatAcuario = new RuleVariable(br, "HabitatAcuario");
        AnilloBlancoPresente = new RuleVariable(br, "AnilloBlancoPresente");
        Especie3 = new RuleVariable(br, "Especie3");
        
        // ESPECIE ABRONIA GRAMINEA
        ColoracionRojiza = new RuleVariable(br, "ColoracionRojiza");
        ColoracionVerde = new RuleVariable(br, "ColoracionVerde");
        ColoracionEsmeralda = new RuleVariable(br, "ColoracionEsmeralda");
        LabiosRojos = new RuleVariable(br, "LabiosRojos");
        ColaOscura = new RuleVariable(br, "ColaOscura");
        BandaDorsal = new RuleVariable(br, "BandaDorsal");
        CabezaAncha = new RuleVariable(br, "CabezaAncha");
        OrejasVisibles = new RuleVariable(br, "OrejasVisibles");
        EscamasQuilladas = new RuleVariable(br, "EscamasQuilladas");
        OjosGrandes = new RuleVariable(br, "OjosGrandes");
        Especie4 = new RuleVariable(br, "Especie4");
        
        // ESPECIE CARETTA CARETTA
        CabezaMuyGrande = new RuleVariable(br, "CabezaMuyGrande");
        Especie5 = new RuleVariable(br, "Especie5");
        
        // Definición de operadores lógicos (condicionales)
        Condition igual = new Condition("=");
        
        // Creacion de reglas de validacion (Base de Reglas)
        //REINOS
        Rule r1 = new Rule(br, "Eubacteria",
            new Clause[]{
                new Clause(Unicelulares, igual, "si"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Eubacteria"));

        Rule r2 = new Rule(br, "Plantae",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "si"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Plantae"));

        Rule r3 = new Rule(br, "Animalia",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "si")
            }, new Clause(Reino, igual, "Animalia"));

        Rule r4 = new Rule(br, "Archaea",
            new Clause[]{
                new Clause(Unicelulares, igual, "si"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "si"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Archaea"));

        Rule r5 = new Rule(br, "Eukarya",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Eukarya"));

        Rule r6 = new Rule(br, "Fungi",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "si"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Fungi"));

        // FILO (R7-R15)
        Rule r7 = new Rule(br, "Mollusca",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "si"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Mollusca"));

        Rule r8 = new Rule(br, "R8_Arthropoda",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "si"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Arthropoda"));

        Rule r9 = new Rule(br, "Platyhelminthes",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "no"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Platyhelminthes"));

        Rule r10 = new Rule(br, "Nematoda",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Nematoda"));

        Rule r11 = new Rule(br, "Chordata",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "si"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "si"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Chordata"));

        Rule r12 = new Rule(br, "Annelida",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "si"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "si")
            }, new Clause(Filo, igual, "Annelida"));

        Rule r13 = new Rule(br, "Cnidaria",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "si"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "no"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Cnidaria"));

        Rule r14 = new Rule(br, "Echinodermata",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "si"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Echinodermata"));

        Rule r15 = new Rule(br, "Porifera",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "no"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "no"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Porifera"));
        // CLASE (R16-R25)
        Rule r16 = new Rule(br, "Agnatha",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "no"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "no")
            }, new Clause(Clase, igual, "Agnatha"));

        Rule r17 = new Rule(br, "Chondrichthyes",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "no")
            }, new Clause(Clase, igual, "Chondrichthyes"));

        Rule r18 = new Rule(br, "Osteichthyes",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Osteichthyes"));
            
        Rule r20 = new Rule(br, "Reptilia",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(GarrasDedos, igual, "si"),
                new Clause(CorazonTresCamaras, igual, "si"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Reptilia"));

        Rule r19 = new Rule(br, "Amphibia",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "si"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Amphibia"));

        Rule r21 = new Rule(br, "Aves",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "no"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(GarrasDedos, igual, "si"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Aves"));

        Rule r22 = new Rule(br, "Mammalia",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "no"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(GarrasDedos, igual, "si"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Mammalia"));

        Rule r23 = new Rule(br, "Sarcopterygii",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "si"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Sarcopterygii"));

        Rule r24 = new Rule(br, "Actinopterygii",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "si"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Actinopterygii"));

        Rule r25 = new Rule(br, "Cephalaspidomorphi",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "no"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Cephalaspidomorphi"));
        
        // ORDEN (R26-R29)
        Rule r26 = new Rule(br, "Squamata",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(CaparazonOseo, igual, "no"),
                new Clause(MudaPiel, igual, "si"),
                new Clause(TercerOjoParietal, igual, "no"),
                new Clause(CuidadoParental, igual, "no")
            }, new Clause(Orden, igual, "Squamata"));

        Rule r27 = new Rule(br, "Rhynchocephalia",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(CaparazonOseo, igual, "no"),
                new Clause(MudaPiel, igual, "no"),
                new Clause(TercerOjoParietal, igual, "si"),
                new Clause(CuidadoParental, igual, "no")
            }, new Clause(Orden, igual, "Rhynchocephalia"));

        Rule r28 = new Rule(br, "Crocodylia",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(CaparazonOseo, igual, "no"),
                new Clause(MudaPiel, igual, "no"),
                new Clause(TercerOjoParietal, igual, "no"),
                new Clause(CuidadoParental, igual, "si")
            }, new Clause(Orden, igual, "Crocodylia"));

        Rule r29 = new Rule(br, "Testudines",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(CaparazonOseo, igual, "si"),
                new Clause(MudaPiel, igual, "no"),
                new Clause(TercerOjoParietal, igual, "no"),
                new Clause(CuidadoParental, igual, "no")
            }, new Clause(Orden, igual, "Testudines"));
        
        //FAMILIA Tabla:"Elapidae/Anguidae/Iguanidae/Amphisbaenidae/Dactyloidae" (R30-R39)
        Rule r30 = new Rule(br, "Elapidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "si"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Elapidae"));

        Rule r31 = new Rule(br, "Gekkonidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "no"),
                new Clause(PupilasVerticales, igual, "si"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Gekkonidae"));

        Rule r32 = new Rule(br, "Varanidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "si"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Varanidae"));

        Rule r33 = new Rule(br, "Anguidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "si"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Anguidae"));

        Rule r35 = new Rule(br, "Amphisbaenidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "si"),
                new Clause(OjosParpadosMoviles, igual, "no"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Amphisbaenidae"));

        Rule r34 = new Rule(br, "Iguanidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "si"),
                new Clause(EscamasEspinosas, igual, "si"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Carnivoros, igual, "no"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Iguanidae"));

        Rule r36 = new Rule(br, "Dactyloidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "si"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "no"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "no"),
                new Clause(HuevosCascaraCalcarea, igual, "no")
            }, new Clause(Familia, igual, "Dactyloidae"));

        Rule r37 = new Rule(br, "Boidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "si"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Boidae"));

        Rule r38 = new Rule(br, "Viperidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "si"),
                new Clause(VenenoPotente, igual, "si"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Viperidae"));

        Rule r39 = new Rule(br, "Chamaelenidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Chamaelenidae"));
        
        //FAMILIA1 Tabla:"Cheloniidae" (R40-R49)
        Rule r40 = new Rule(br, "Cheloniidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "si"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Cheloniidae"));

        Rule r41 = new Rule(br, "Dermochelyidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "si"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "si"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Dermochelyidae"));

        Rule r42 = new Rule(br, "Chelydridae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Chelydridae"));

        Rule r43 = new Rule(br, "Trionychidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "si"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Trionychidae"));

        Rule r44 = new Rule(br, "Carettochelyidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "si")
            }, new Clause(Familia1, igual, "Carettochelyidae"));

        Rule r45 = new Rule(br, "Kinosternidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Kinosternidae"));

        Rule r46 = new Rule(br, "Emydidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "si"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "si"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Emydidae"));

        Rule r47 = new Rule(br, "Geoemydidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "si"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Geoemydidae"));

        Rule r48 = new Rule(br, "Testudinidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "si"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Testudinidae"));

        Rule r49 = new Rule(br, "Platysternidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "si"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia1, igual, "Platysternidae"));
        
        //GENERO Tabla:"Bipes" (R50-R59)
        Rule r50 = new Rule(br, "Colubridae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),        // Nota: Esto parece un error en la tabla original
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "si"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Colubridae"));

        Rule r51 = new Rule(br, "Boidae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "si"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "si"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Boidae"));

        Rule r52 = new Rule(br, "Viperidae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "si"),
                new Clause(Venenoso, igual, "si"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Viperidae"));

        Rule r53 = new Rule(br, "Gekkonidae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "si"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "si"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Gekkonidae"));

        Rule r54 = new Rule(br, "Scincidae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Scincidae"));

        Rule r55 = new Rule(br, "Teiidae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "si"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Teiidae"));

        Rule r56 = new Rule(br, "Lacertidae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Lacertidae"));

        Rule r57 = new Rule(br, "Helodermatidae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "si"),
                new Clause(PielOsteodermos, igual, "si"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Helodermatidae"));

        Rule r58 = new Rule(br, "Tropiduridae",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "si")
            }, new Clause(Genero, igual, "Tropiduridae"));

        Rule r59 = new Rule(br, "Bipes",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "si"),
                new Clause(OjosReducidos, igual, "si"),
                new Clause(AdaptadoExcavar, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "si"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Bipes"));

        //(R60-R69)
        Rule r60 = new Rule(br, "Ctenosaura",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "si"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "si"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(Arboricola, igual, "si"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero1, igual, "Ctenosaura"));

        Rule r61 = new Rule(br, "Iguana",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(Arboricola, igual, "si"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero1, igual, "Iguana"));

        Rule r62 = new Rule(br, "Dipsosaurus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(Arboricola, igual, "no"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero1, igual, "Dipsosaurus"));

        Rule r63 = new Rule(br, "Sauromalus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(Arboricola, igual, "no"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero1, igual, "Sauromalus"));

        Rule r64 = new Rule(br, "Brachylophus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(Arboricola, igual, "si"),
                new Clause(EsTerrestre, igual, "no"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero1, igual, "Brachylophus"));

        Rule r65 = new Rule(br, "Cyclura",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "si"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(Arboricola, igual, "no"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero1, igual, "Cyclura"));

        Rule r66 = new Rule(br, "Amblyrhynchus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(Arboricola, igual, "no"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "si"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero1, igual, "Amblyrhynchus"));

        Rule r67 = new Rule(br, "Conolophus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(Arboricola, igual, "no"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero1, igual, "Conolophus"));

        Rule r68 = new Rule(br, "Oplurus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "no"),
                new Clause(Omnivoro, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "si"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(Arboricola, igual, "no"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero1, igual, "Oplurus"));

        Rule r69 = new Rule(br, "Phrynosoma",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "no"),
                new Clause(Omnivoro, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(Arboricola, igual, "no"),
                new Clause(EsTerrestre, igual, "si"),
                new Clause(EsMarino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero1, igual, "Phrynosoma"));
        
        //(R70-R79)
        Rule r70 = new Rule(br, "Anolis",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"), // caracteristica mal escrita en la tabla Dactyloidae
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "si"),
                new Clause(PapadaExtensible, igual, "si"),
                new Clause(PapadaGrande, igual, "si"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Anolis"));

        Rule r71 = new Rule(br, "Norops",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Norops"));

        Rule r72 = new Rule(br, "Ctenonotus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "no"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Ctenonotus"));

        Rule r73 = new Rule(br, "Deyroptyx",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "si"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Deyroptyx"));

        Rule r74 = new Rule(br, "Dactyloa",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "si"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Dactyloa"));

        Rule r75 = new Rule(br, "Chamaelinorops",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "si"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Chamaelinorops"));

        Rule r76 = new Rule(br, "Xiphosurus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "no"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Xiphosurus"));

        Rule r77 = new Rule(br, "Audantia",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "si"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Audantia"));

        Rule r78 = new Rule(br, "Divinatus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "si"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Divinatus"));

        Rule r79 = new Rule(br, "Phenacosaurus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(Dactylidae, igual, "no"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero2, igual, "Phenacosaurus"));
        // (R80-R89)
        Rule r80 = new Rule(br, "Acanthophis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "no"),
                new Clause(PupilaRedonda, igual, "no"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "si"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Acanthophis"));

        Rule r81 = new Rule(br, "Pseudechis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Pseudechis"));

        Rule r82 = new Rule(br, "Notechis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "si"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Notechis"));

        Rule r83 = new Rule(br, "Laticauda",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "si"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "si"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Laticauda"));

        Rule r84 = new Rule(br, "Hydrophis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "si"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "si"),
                new Clause(EscamasVentralesDesarrolladas, igual, "no"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Hydrophis"));

        Rule r85 = new Rule(br, "Bungarus",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "si")
            }, new Clause(Genero3, igual, "Bungarus"));

        Rule r86 = new Rule(br, "Naja",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "si"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Naja"));

        Rule r87 = new Rule(br, "Micrurus",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Micrurus"));

        Rule r88 = new Rule(br, "Ophiophagus",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ExpandeCuello, igual, "si"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Ophiophagus"));

        Rule r89 = new Rule(br, "Dendroaspis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero3, igual, "Dendroaspis"));
        
        //(R90-R98)
        Rule r90 = new Rule(br, "Elgaria",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "si"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "no"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Elgaria"));

        Rule r91 = new Rule(br, "Gerrhonotus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "si"),
                new Clause(SinPatas1, igual, "no"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Gerrhonotus"));

        Rule r92 = new Rule(br, "Ophisaurus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Ophisaurus"));

        Rule r93 = new Rule(br, "Anguis",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "si")
            }, new Clause(Genero4, igual, "Anguis"));

        Rule r94 = new Rule(br, "Abronia",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "no"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Abronia"));

        Rule r95 = new Rule(br, "Dopasia",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "si"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Dopasia"));
        
        Rule r96 = new Rule(br, "Mesaspis",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "no"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "si"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Mesaspis"));

        Rule r97 = new Rule(br, "Hyalosaurus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "si"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Hyalosaurus"));

        Rule r98 = new Rule(br, "Pseudopus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas1, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "si"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero4, igual, "Pseudopus"));
        
        //GENERO Tabla: CARETTA(R99-R103)
        Rule r99 = new Rule(br, "Eretmochelys",
            new Clause[]{
                new Clause(Familia1, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "si"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado1, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero5, igual, "Eretmochelys"));

        Rule r100 = new Rule(br, "Chelonia",
            new Clause[]{
                new Clause(Familia1, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "no"),
                new Clause(DietaHerbivora, igual, "si"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado1, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero5, igual, "Chelonia"));

        Rule r101 = new Rule(br, "Caretta",
            new Clause[]{
                new Clause(Familia1, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "no"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "si"),
                new Clause(CaparazonAplanado1, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero5, igual, "Caretta"));

        Rule r102 = new Rule(br, "Lepidochelys",
            new Clause[]{
                new Clause(Familia1, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "si"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado1, igual, "si"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero5, igual, "Lepidochelys"));

        Rule r103 = new Rule(br, "Natator",
            new Clause[]{
                new Clause(Familia1, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "no"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado1, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "si")
            }, new Clause(Genero5, igual, "Natator"));
        
        //ESPECIES
        //Tabla: Bipes biporus (R104-R108)
        Rule r104 = new Rule(br, "Bipes_biporus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "si"),
                new Clause(PeninsulaBajaCalifornia, igual, "si"),
                new Clause(EstadoGuerrero, igual, "no"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "no"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "si"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "si"),
                new Clause(AnillosCuerpo, igual, "si")
            }, new Clause(Especie, igual, "Lagarto Topo Mexicano")); // Posible conclusión final (nombre comuún)

        Rule r105 = new Rule(br, "Bipes_canaliculatus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "si"),
                new Clause(PeninsulaBajaCalifornia, igual, "no"),
                new Clause(EstadoGuerrero, igual, "si"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "no"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "si"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "no"),
                new Clause(AnillosCuerpo, igual, "no")
            }, new Clause(Especie, igual, "Bipes canaliculatus"));

        Rule r106 = new Rule(br, "Bipes_tridactylus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "si"),
                new Clause(PeninsulaBajaCalifornia, igual, "no"),
                new Clause(EstadoGuerrero, igual, "si"),
                new Clause(EstadoMichoacan, igual, "si"),
                new Clause(ChiapasGuatemala, igual, "no"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "no"),
                new Clause(AnillosCuerpo, igual, "si")
            }, new Clause(Especie, igual, "Bipes tridactylus"));

        Rule r107 = new Rule(br, "Bipes_alvarezi",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "no"),
                new Clause(PeninsulaBajaCalifornia, igual, "si"),
                new Clause(EstadoGuerrero, igual, "no"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "si"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "no"),
                new Clause(AnillosCuerpo, igual, "si")
            }, new Clause(Especie, igual, "Bipes alvarezi"));

        Rule r108 = new Rule(br, "Bipes_fuliginosus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "no"),
                new Clause(PeninsulaBajaCalifornia, igual, "no"),
                new Clause(EstadoGuerrero, igual, "no"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "si"),
                new Clause(HastaCostaRica, igual, "si"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "si"),
                new Clause(ColoracionRosadaPalida, igual, "no"),
                new Clause(AnillosCuerpo, igual, "no")
            }, new Clause(Especie, igual, "Bipes fuliginosus"));
        
        /*Rule r109 = new Rule(br, "LagartoTopoMexicano",
            new Clause[]{
                new Clause(Especie, igual, "Bipes biporus")
            }, new Clause(Especie, igual, "Lagarto Topo Mexicano"));*/
        
        //Tabla: Ctenosaura defensor
        Rule r110 = new Rule(br, "Ctenosaura_defensor",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "si"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Iguana yucateca de cola espinosa")); // Posible conclusión final (nombre comuún)

        Rule r111 = new Rule(br, "Ctenosaura_pectinata",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "si"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura pectinata"));

        Rule r112 = new Rule(br, "Ctenosaura_similis",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "si"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura similis"));

        Rule r113 = new Rule(br, "Ctenosaura_acanthura",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "si"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "si"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura acanthura"));

        Rule r114 = new Rule(br, "Ctenosaura_quinquecarintata",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "si"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura quinquecarintata"));

        Rule r115 = new Rule(br, "Ctenosaura_hemilopha",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "si"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura hemilopha"));

        Rule r116 = new Rule(br, "Ctenosaura_oaxacana",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura oaxacana"));

        Rule r117 = new Rule(br, "Ctenosaura_bakeri",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "si"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura bakeri"));

        Rule r118 = new Rule(br, "Ctenosaura_melanosterna",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "si"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie1, igual, "Ctenosaura melanosterna"));

        Rule r119 = new Rule(br, "Ctenosaura_flavidorsalis",
            new Clause[]{
                new Clause(Genero1, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "si")
            }, new Clause(Especie1, igual, "Ctenosaura flavidorsalis"));

       /* Rule r120 = new Rule(br, "R120_IguanaYucateca",
            new Clause[]{
                new Clause(Especie, igual, "Ctenosaura defensor")
            }, new Clause(Especie, igual, "Iguana Yucateca de Cola Espinosa"));*/
       
       //Tabla: Anolis naufragus (R121-R129)
       Rule r121 = new Rule(br, "Anolis_carolinensis",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanioGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "si"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie2, igual, "Anolis carolinensis"));

        Rule r122 = new Rule(br, "Anolis_sagrei",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "no"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanioGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "si"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie2, igual, "Anolis sagrei"));

        Rule r123 = new Rule(br, "Anolis_porcatus",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanioGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "si"),
                new Clause(EscamasRugosas, igual, "no")
            }, new Clause(Especie2, igual, "Anolis porcatus"));

        Rule r124 = new Rule(br, "Anolis_cristatellus",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanioGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie2, igual, "Anolis cristatellus"));

        Rule r125 = new Rule(br, "Anolis_naufragus",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanioGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "si"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie2, igual, "Abaniquillo de Hidalgo")); //Posible conclusión final (nombre comuún)

        Rule r126 = new Rule(br, "Anolis_equestris",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanioGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie2, igual, "Anolis equestris"));

        Rule r127 = new Rule(br, "Anolis_cybotes",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanioGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie2, igual, "Anolis cybotes"));

        Rule r128 = new Rule(br, "Anolis_chlorocyanus",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanioGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "si"),
                new Clause(DewlapRojo, igual, "si"),
                new Clause(EscamasRugosas, igual, "no")
            }, new Clause(Especie2, igual, "Anolis chlorocyanus"));

        Rule r129= new Rule(br, "Anolis_gorgonae",
            new Clause[]{
                new Clause(Genero2, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanioGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "no")
            }, new Clause(Especie2, igual, "Anolis gorgonae"));

        /*Rule r130 = new Rule(br, "R154_AbaniquilloHidalgo",
            new Clause[]{
                new Clause(Especie, igual, "Anolis naufragus")
            }, new Clause(Especie, igual, "Abaniquillo de Hidalgo"));*/
        
        //Tabla: Micrurus laticollaris (R131-R140)
        Rule r131 = new Rule(br, "Micrurus_mipartitus",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "si"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "no")
            }, new Clause(Especie3, igual, "Micrurus mipartitus"));

        Rule r132 = new Rule(br, "Micrurus_tener",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "si"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus tener"));

        Rule r133 = new Rule(br, "Micrurus_fulvius",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus fulvius"));

        Rule r134 = new Rule(br, "Micrurus_laticollaris",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "si"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "no")
            }, new Clause(Especie3, igual, "Coralillo de balsas"));//Posible conclusión final (nombre comuún)

        Rule r135 = new Rule(br, "Micrurus_nigrocinctus",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "si"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus nigrocinctus"));

        Rule r136 = new Rule(br, "Micrurus_surinamensis",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "si"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus surinamensis"));

        Rule r137 = new Rule(br, "Micrurus_frontalis",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus frontalis"));

        Rule r138 = new Rule(br, "Micrurus_lemniscatus",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus lemniscatus"));

        Rule r139 = new Rule(br, "Micrurus_diastema",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "si"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "si"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus diastema"));

        Rule r140 = new Rule(br, "Micrurus_pyrrhocryptus",
            new Clause[]{
                new Clause(Genero3, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie3, igual, "Micrurus pyrrhocryptus"));
        
         /*Rule r141 = new Rule(br, "R133_CoralilloBalsas",
            new Clause[]{
                new Clause(Especie, igual, "Micrurus laticollaris")
            }, new Clause(Especie, igual, "Coralillo de balsas")); */
         
         //Tabla: Abronia graminea (R142-R151)
         Rule r142 = new Rule(br, "Abronia_meledona",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "si"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia meledona"));

        Rule r143 = new Rule(br, "Abronia_mixteca",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "si"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Dragon sierra mixteca"));//Posible conclusión final (nombre comuún)

        Rule r144 = new Rule(br, "Abronia_graminea",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "si"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia graminea"));

        Rule r145 = new Rule(br, "Abronia_lythrochila",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "si"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia lythrochila"));

        Rule r146 = new Rule(br, "Abronia_deppii",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "si"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia deppii"));

        Rule r147 = new Rule(br, "Abronia_taeniata",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "si"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia taeniata"));

        Rule r148 = new Rule(br, "Abronia_campbelli",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "si")
            }, new Clause(Especie4, igual, "Abronia campbelli"));

        Rule r149 = new Rule(br, "Abronia_frosti",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "si"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia frosti"));

        Rule r150 = new Rule(br, "Abronia_aurita",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "si"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia aurita"));

        Rule r151 = new Rule(br, "Abronia_salvadorensis",
            new Clause[]{
                new Clause(Genero4, igual, "Abronia"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "si"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie4, igual, "Abronia salvadorensis"));

        /*Rule r152 = new Rule(br, "DragonSierraMixteca",
            new Clause[]{
                new Clause(Especie, igual, "Abronia mixteca")
            }, new Clause(Especie, igual, "Dragon Sierra Mixteca"));*/
        
        //Tabla:Caretta caretta (R153)
        Rule r153 = new Rule(br, "Caretta_caretta",
            new Clause[]{
                new Clause(Genero5, igual, "Caretta"),
                new Clause(CabezaMuyGrande, igual, "si")
            }, new Clause(Especie5, igual, "Tortuga caguama")); //Posible

        /*Rule r154 = new Rule(br, "TortugaCaguama",
            new Clause[]{
                new Clause(Especie, igual, "Caretta caretta")
            }, new Clause(Especie, igual, "Tortuga caguama"));*/
    }
}