package object sbtrelease {
  type Versions = (String, String)

  def versionFormatError = sys.error("Version format is not compatible with " + Version.VersionR.pattern.toString)
}
