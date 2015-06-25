IMAGE_INSTALL += "\
    python-core \
    python-shell \
    python-re \
    python-lang \
    python-io \
    python-math \
    python-dbus \
    python-threading \
    python-logging \
    python-argparse \
    python-json \
    python-pygobject \
    python-dpath \
    python-dbd \
    python-dbd-dbd \
    python-dbd-dbtools \
    python-syslog \
    python-pyxs \
"

PRINC := "${@int(PRINC) + 2}"
