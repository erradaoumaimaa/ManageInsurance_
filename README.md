# 🏢 Application de Gestion des Contrats d'Assurance

## 📜 Contexte du projet
Dans une compagnie d'assurance fictive, une équipe de développement où vous occupez le rôle de développeur a été chargée de créer une application destinée à simplifier la gestion des contrats d'assurance pour les clients. L'objectif est de permettre aux utilisateurs d'accéder facilement à divers services liés à leurs polices d'assurance. Les clients peuvent ainsi gérer leurs assurances automobile, habitation et santé en ligne, ce qui améliore l'expérience utilisateur et réduit les coûts administratifs.

---

## ⚙️ Fonctionnalités de l'Application

1. **Inscription et Connexion :**
   - Les utilisateurs doivent créer un compte avec des informations personnelles (nom, adresse, email, numéro de téléphone).

2. **Obtenir des Devis d'Assurance :**
   - Les utilisateurs peuvent demander des devis en remplissant un formulaire avec des détails sur le type d'assurance souhaité.
   - Les devis sont calculés en fonction de divers critères (âge, valeur du bien, historique de sinistres, etc.).

3. **Souscription à des Contrats :**
   - Une fois le devis accepté, l'utilisateur peut souscrire au contrat d'assurance en fournissant des documents nécessaires (permis de conduire, justificatif de domicile, etc.).

4. **Gestion des Contrats :**
   - Les utilisateurs peuvent modifier leurs informations de contrat (adresse, véhicule, etc.) ou résilier leur contrat directement via l'application.

---

## 📊 Règles de Calcul des Devis

### 1. Assurance Automobile :
- **Paramètres :**
  - Âge du conducteur
  - Type de véhicule (modèle, marque, type (luxe, utilitaire, etc.))
  - Utilisation du véhicule (privée, professionnelle)
  - Historique de conduite (accidents, infractions)
- **Exemple de calcul par mois :**
  - Base : 500 MAD
  - +10 % si le conducteur a moins de 25 ans.
  - +15 % pour un véhicule de luxe.
  - +10 % pour l'utilisation professionnelle.
  - -20 % pour un conducteur sans sinistre depuis 3 ans, +10 % sinon.

### 2. Assurance Habitation :
- **Paramètres :**
  - Valeur du bien
  - Type de logement (appartement, maison, etc.)
  - Localisation (zone à risque)
  - Système de sécurité (alarme, caméras)
- **Exemple de calcul :**
  - Base : 300 MAD
  - +2 % si le bien est une maison.
  - +5 % si le logement est situé dans une zone à risque.
  - +10 % si la valeur du bien dépasse 200 000 MAD.
  - -15 % si l'assuré dispose d'un système de sécurité, +15 % sinon.

### 3. Assurance Santé :
- **Paramètres :**
  - Âge
  - État de santé (antécédents médicaux)
  - Type de couverture (de base, premium)
- **Exemple de calcul :**
  - Base : 150 MAD
  - +20 % pour les personnes de plus de 60 ans.
  - +30 % pour les antécédents de maladies chroniques.
  - -10 % pour une couverture de base, +5 % pour premium.

---

## 💻 Technologies Utilisées
- **Spring Core**
- **Spring Web**
- **JSP**
- **JPA**
- **JUnit / Mockito**

---

## 🚀 Installation
1. Clonez le projet :
   ```bash
   git clone https://github.com/votre-utilisateur/nom-du-repo.git
