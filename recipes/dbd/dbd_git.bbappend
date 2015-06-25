INITSCRIPT_NAME = "dbd.orig"
INITSCRIPT_PARAMS = "stop 0 6"

do_install_append() {
    mv ${D}/usr/bin/dbd ${D}/usr/bin/dbd.orig
    mv ${D}/usr/bin/db-cmd ${D}/usr/bin/dbd-cmd.orig
    mv ${D}/usr/bin/db-ls ${D}/usr/bin/dbd-ls.orig
    mv ${D}/usr/bin/db-exists ${D}/usr/bin/dbd-exists.orig
    mv ${D}/usr/bin/db-rm ${D}/usr/bin/dbd-rm.orig
    mv ${D}/usr/bin/db-cat ${D}/usr/bin/dbd-cat.orig
    mv ${D}/usr/bin/db-nodes ${D}/usr/bin/dbd-nodes.orig
    mv ${D}/usr/bin/db-read ${D}/usr/bin/dbd-read.orig
    mv ${D}/usr/bin/db-write ${D}/usr/bin/dbd-write.orig
    mv ${D}/etc/init.d/dbd ${D}/etc/init.d/dbd.orig
    # fixup default template - should be a db migration
    sed -i 's| true | "true" |g' ${D}/usr/share/xenclient/db.default
}

PRINC := "${@int(PRINC) + 2}"
