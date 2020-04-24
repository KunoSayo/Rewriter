package com.euonmyoji.rewriter;

import com.google.inject.Inject;
import org.bstats.sponge.Metrics2;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.plugin.Plugin;

import java.nio.file.Path;

/**
 * @author yinyangshi Aurora5090
 */
@Plugin(id = "rewriter", name = "Rewriter", version = Rewriter.VERSION, authors = {"Aurora5090", "yinyangshi"},
        description = "Rewrite written ")
public final class Rewriter {
    public static final String VERSION = "@spongeVersion@";
    public static Rewriter plugin;
    @Inject
    @ConfigDir(sharedRoot = false)
    private Path defaultCfgDir;
    @Inject
    private Metrics2 metrics;

    public Rewriter() {
        plugin = this;
    }
}
