{ mics-build ? (import ../mics-build).mics-build }:
mics-build.buildSbtLibrary {
    name = "amqp-client";
    src = ./.;
    repo = [
      (import ./repo.nix)
      (import ./project/repo.nix)
      (import ./manual-repo.nix)
    ];
}
