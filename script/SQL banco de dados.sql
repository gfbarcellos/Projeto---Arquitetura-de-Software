-- SQL gerado dia 04-09-2018 - Matheus Sant Anna de Oliveira

CREATE TABLE `coleta` (
  `id_coleta` int(11) NOT NULL,
  `dt_coleta` date NOT NULL,
  `id_municipio` int(11) NOT NULL,
  `urbano_rural` char(1) NOT NULL,
  `id_local_destino` int(11) NOT NULL,
  `km_feita` float  NULL,
  `id_veiculo` int(11)  NULL,
  `id_empresa` int(11)  NULL,
  `id_tipo_coleta` int(11)  NULL,
  PRIMARY KEY (`id_coleta`),
  KEY `fk_coleta_1_idx` (`id_municipio`),
  KEY `fk_coleta_2_idx` (`id_local_destino`),
  KEY `fk_coleta_3_idx` (`id_veiculo`),
  KEY `fk_coleta_4_idx` (`id_empresa`),
  KEY `fk_coleta_5_idx` (`id_tipo_coleta`),
  CONSTRAINT `fk_coleta_1` FOREIGN KEY (`id_municipio`) REFERENCES `municipio` (`id_municipio`),
  CONSTRAINT `fk_coleta_2` FOREIGN KEY (`id_local_destino`) REFERENCES `local` (`id_local`),
  CONSTRAINT `fk_coleta_3` FOREIGN KEY (`id_veiculo`) REFERENCES `veiculo` (`id_veiculo`),
  CONSTRAINT `fk_coleta_4` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`),
  CONSTRAINT `fk_coleta_5` FOREIGN KEY (`id_tipo_coleta`) REFERENCES `tipo_coleta` (`id_coleta`)
) ENGINE=InnoDB  ;

CREATE TABLE `coleta_residuo` (
  `id_coleta_residuo` int(11) NOT NULL,
  `id_coleta` int(11)  NULL,
  `id_residuo_solido` int(11)  NULL,
  `qtd` float  NULL,
  PRIMARY KEY (`id_coleta_residuo`),
  KEY `fk_coleta_residuo_1_idx` (`id_coleta`),
  KEY `fk_coleta_residuo_2_idx` (`id_residuo_solido`),
  CONSTRAINT `fk_coleta_residuo_1` FOREIGN KEY (`id_coleta`) REFERENCES `coleta` (`id_coleta`),
  CONSTRAINT `fk_coleta_residuo_2` FOREIGN KEY (`id_residuo_solido`) REFERENCES `residuo_solido` (`id_residuo_solido`)
) ENGINE=InnoDB  ;

CREATE TABLE `empresa` (
  `id_empresa` int(11) NOT NULL,
  `nm_empresa` varchar(50)  NULL,
  `cnpj` varchar(50)  NULL,
  PRIMARY KEY (`id_empresa`)
) ENGINE=InnoDB  ;

CREATE TABLE `licitacao` (
  `id_licitacao` int(11) NOT NULL,
  `dt_assinatura_licitacao` date  NULL,
  `id_municipio` int(11)  NULL,
  `id_empresa` int(11)  NULL,
  `dt_validade` date  NULL,
  `valor` float  NULL,
  PRIMARY KEY (`id_licitacao`),
  KEY `fk_licitacao_1_idx` (`id_municipio`),
  KEY `fk_licitacao_1_idx1` (`id_empresa`),
  CONSTRAINT `fk_licitacao_1` FOREIGN KEY (`id_municipio`) REFERENCES `municipio` (`id_municipio`),
  CONSTRAINT `fk_licitacao_2` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`)
) ENGINE=InnoDB  ;

CREATE TABLE `local` (
  `id_local` int(11) NOT NULL,
  `nm_local` varchar(50)  NULL,
  PRIMARY KEY (`id_local`)
) ENGINE=InnoDB  ;

CREATE TABLE `municipio` (
  `id_municipio` int(11) NOT NULL,
  `nm_municipio` varchar(50)  NULL,
  `pop_total` int(11)  NULL,
  `pop_urbana` int(11)  NULL,
  PRIMARY KEY (`id_municipio`)
) ENGINE=InnoDB  ;

CREATE TABLE `residuo_solido` (
  `id_residuo_solido` int(11) NOT NULL,
  `nm_residuo_solido` varchar(50)  NULL,
  `residuo_solido_pai` int(11)  NULL,
  `id_tipo_residuo_solido` int(11)  NULL,
  PRIMARY KEY (`id_residuo_solido`),
  KEY `fk_residuo_solido_1_idx` (`residuo_solido_pai`),
  KEY `fk_residuo_solido_2_idx` (`id_tipo_residuo_solido`),
  CONSTRAINT `fk_residuo_solido_1` FOREIGN KEY (`residuo_solido_pai`) REFERENCES `residuo_solido` (`id_residuo_solido`),
  CONSTRAINT `fk_residuo_solido_2` FOREIGN KEY (`id_tipo_residuo_solido`) REFERENCES `tipo_residuo_solido` (`id_tipo_residuo_solido`)
) ENGINE=InnoDB  ;

CREATE TABLE `tipo_coleta` (
  `id_coleta` int(11) NOT NULL,
  `nm_tipo_coleta` varchar(50)  NULL,
  PRIMARY KEY (`id_coleta`)
) ENGINE=InnoDB  ;

CREATE TABLE `tipo_residuo_solido` (
  `id_tipo_residuo_solido` int(11) NOT NULL,
  `nm_tipo_residuo_solido` varchar(50)  NULL,
  PRIMARY KEY (`id_tipo_residuo_solido`)
) ENGINE=InnoDB  ;

CREATE TABLE `veiculo` (
  `id_veiculo` int(11) NOT NULL,
  `nm_veiculo` varchar(50)  NULL,
  `placa` int(11)  NULL,
  `km_total` float  NULL,
  `id_empresa` int(11) NOT NULL,
  PRIMARY KEY (`id_veiculo`),
  KEY `fk_veiculo_1_idx` (`id_empresa`),
  CONSTRAINT `fk_veiculo_1` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`)
) ENGINE=InnoDB  ;